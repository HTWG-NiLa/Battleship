package main.java.model.impl;

import main.java.model.IBattleground;

public class Battleground implements IBattleground {
	
	private Cell[][] matrix;
	
	public Battleground(int length) {
		matrix = new Cell[length][length];
		for(int x = 0; x < length; x++) {
			for (int y = 0; y < length; y++) {
				matrix[x][y].setX(x);
				matrix[x][y].setY(y);
			}
		}
	}
	//orientation: 0 -> rechts; 1 -> unten; 2 -> links; 3 -> oben
	public void addShip(Ship ship, Cell destination, int orientation) {
		Orientation enum_orient = Orientation.getByCode(orientation);
		if(enum_orient != null) {
			Cell[] cells_to_modify = enum_orient.getAffectedCells(ship.getLength(), matrix, destination);
			for(Cell c : cells_to_modify) {
				c.setShip(ship);
			}
		}
	}
}
