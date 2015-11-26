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
		int x = destination.getX();
		int y = destination.getY();
		
		if(orientation == 0) {
			for (int i = 0; i < ship.getLength(); i++) {
				matrix[x + i][y].setShip(ship);
			}
		} else if (orientation == 1) {
			for (int i = 0; i < ship.getLength(); i++) {
				matrix[x][y + i].setShip(ship);
			}
		} else if (orientation == 2) {
			for (int i = 0; i < ship.getLength(); i++) {
				matrix[x - i][y].setShip(ship);
			}
		} else if (orientation == 3) {
			for (int i = 0; i < ship.getLength(); i++) {
				matrix[x][y - i].setShip(ship);
			}
		}
	}
}
