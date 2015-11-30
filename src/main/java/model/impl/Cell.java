package main.java.model.impl;

import java.awt.geom.Point2D;

import main.java.model.ICell;

public class Cell implements ICell {

	private boolean bombed;
	private Ship occupyer;
	private int x;
	private int y;

	public Cell(Point2D point) {
		bombed = false;
		setOccupyer(null);
		x = (int) point.getX();
		y = (int) point.getY();
	}
	
	public boolean bomb() {
		if(occupyer != null && !bombed) {
			bombed = true;
		}
		return bombed;
	}
	
	public boolean isBombed() {
		return bombed;
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

	public Ship getOccupyer() {
		return occupyer;
	}

	public void setOccupyer(Ship occupyer) {
		this.occupyer = occupyer;
	}

}