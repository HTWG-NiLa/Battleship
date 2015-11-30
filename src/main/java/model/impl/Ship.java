package main.java.model.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.model.IShip;

public class Ship implements IShip {
	
	private Cell[] cells;
	private int length;
	private boolean horizontal;
	
	
	public Ship(boolean horizontal, int length) {
		this.length = length;
		cells = new Cell[length];
	}
	
	public boolean isDestroyed() {
		for (Cell each : cells) {
			if (!each.isBombed()) {
				return false;
			}
		}
		return true;
	}
	

	public void setCells(Cell[] cells) {
		this.cells = cells;
	}
	
	public Cell[] getCells() {
		return cells;
	}

	public int getLength() {
		return length;
	}

	public boolean isHorizontal() {
		return horizontal;
	}

	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}

}