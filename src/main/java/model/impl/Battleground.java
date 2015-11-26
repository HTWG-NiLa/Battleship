package main.java.model.impl;

import main.java.model.IBattleground;
import main.java.model.impl.Player;

public class Battleground implements IBattleground {
	
	private Field[][] matrix;
	private int length;
	private Player owner;
	
	public Battleground(int length) {
		this.length = length;
		matrix = new Field[length][length];
		for(int x = 0; x < length; x++) {
			for (int y = 0; y < length; y++) {
				matrix[x][y].setX(x);
				matrix[x][y].setY(y);
			}
		}
	}
	//orientation: 0 -> rechts; 1 -> unten; 2 -> links; 3 -> oben
	public void addShip(Ship ship, Field destination, int orientation) {
		int x = destination.getX();
		int y = destination.getY();
		
		

	}
}
