package main.java.model.impl;

import java.awt.Point;

import main.java.model.IBattleground;

public class Battleground implements IBattleground {
	
	private Cell[][] matrix;
	private int length;
	
	public Battleground(int length) {
		this.length = length;
		matrix = new Cell[length][length];
		for(int x = 0; x < length; x++) {
			for (int y = 0; y < length; y++) {
				matrix[x][y] = new Cell(new Point(x,y));
			}
		}
	}
	
	public boolean bomb(Point destination) {
		return false;
	}
	
	public void addShip(Ship ship, Point destination) {
		int x = (int) destination.getX();
		int y = (int) destination.getY();
		if(x >= length || y >= length) {
			throw new IllegalArgumentException("Invalid destination point");
		}
		if(ship.isHorizontal()) {
			for(int i = 0; i < ship.getLength(); i ++) {
				ship.getCells()[i] = matrix[x][y + i];
			}
		} else {
			for(int i = 0; i < ship.getLength(); i ++) {
				ship.getCells()[i] = matrix[x + i][y];
			}
		}
	}
}
