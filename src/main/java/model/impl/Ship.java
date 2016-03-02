package model.impl;

import java.util.ArrayList;
import java.util.List;

import model.ICell;
import model.IShip;

public class Ship implements IShip {
	
	private List<Cell> cells;
	private int length;
	
	public Ship(int length) {
		this.length = length;
		cells = new ArrayList<>(length);
	}

	@Override
	public List<ICell> getCells() {
		List<ICell> tmp = new ArrayList<>(cells);
		return tmp;
	}

	public void addCell(Cell c) {
		cells.add(c);
	}

	public int getLength() {
		return length;
	}
}