package model.impl;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import model.IBattleground;
import model.Enums.CellStatus;
import model.Enums.Orientation;

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
	
	public CellStatus bomb(Point destination) {
		int x = (int) destination.getX();
		int y = (int) destination.getY();
		return matrix[x][y].bomb();
	}
	
	public void addShip(Ship ship, Point destination) {
		int x = (int) destination.getX();
		int y = (int) destination.getY();
		if(x >= length || y >= length) {
			throw new IllegalArgumentException("Invalid destination point");
		}
		if(x + ship.getLength() >= length || y + ship.getLength() >= length) {
			throw new IllegalArgumentException("Ship is too long");
		}
		List<Cell> destination_cells = new ArrayList<>();
		if(ship.getOrientation() == Orientation.HORIZONTAL) {
			for(int i = 0; i < ship.getLength(); i ++) {
				destination_cells.add(matrix[x][y + i]);
			}
		} else {
			for(int i = 0; i < ship.getLength(); i ++) {
				destination_cells.add(matrix[x + i][y]);
			}
		}
		ship.setCells(destination_cells);
	}
}
