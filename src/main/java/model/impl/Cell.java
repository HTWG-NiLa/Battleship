package main.java.model.impl;

import java.awt.geom.Point2D;

import main.java.model.IField;

public class Cell implements IField {

	private Ship occupyer;
	private boolean bombed;
	private int x;
	private int y;

	public Cell(Point2D point) {
		occupyer = null;
		bombed = false;
		x = (int) point.getX();
		y = (int) point.getY();
	}

	public boolean isBombed() {
		return bombed;
	}

	public boolean bomb() throws Exception {
		if (bombed) {
			throw new Exception();
		}
		bombed = true;
		if (occupyer == null) {
			return false;
		}
		return true;
	}

	public void setShip(Ship ship) {
		occupyer = ship;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}