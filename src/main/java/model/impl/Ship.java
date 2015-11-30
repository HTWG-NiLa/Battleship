package main.java.model.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.model.IShip;

public class Ship implements IShip {
	
	private List<Cell> cells;
	private int length;
	
	private Orientation orientation;
	
	public Ship(int length) {
		orientation = Orientation.NOT_DEFINED;
		this.length = length;
		cells = new ArrayList<>(length);
	}
	public Ship(Orientation orient, int length) {
		orientation = orient;
		this.length = length;
		cells = new ArrayList<>(length);
	}
	
	public boolean isDestroyed() {
		for (Cell each : cells) {
			if (!each.isBombed()) {
				return false;
			}
		}
		return true;
	}
	
	public Orientation getOrientation() {
		return orientation;
	}

	public void setCells(List<Cell> cells) {
		this.cells.clear();
		for(Cell each : cells) {
			if(each.getOccupyer() != null) {
				throw new IllegalArgumentException("Cell is already occupied by another ship");
			}
			each.setOccupyer(this);
			this.cells.add(each);
		}
	}
	
	public List<Cell> getCells() {
		return cells;
	}

	public int getLength() {
		return length;
	}

}