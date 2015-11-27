package main.java.model.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.model.IShip;

public class Ship implements IShip {
	
	private List<Cell> cells = new ArrayList<Cell>();
 
	public boolean isDestroyed() {
		for (Cell each : cells) {
			if (!each.isBombed()) {
				return false;
			}
		}
		return true;
	}
	

	public void setFields(List<Cell> cells) {
		this.cells = new ArrayList<Cell>(cells);
	}

	public int getLength() {
		return cells.size();
	}

}