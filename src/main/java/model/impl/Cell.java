package main.java.model.impl;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import main.java.model.IField;

public class Cell implements IField {

	private Ship occupyer;
	private boolean bombed;
	private int x;
	private int y;
//	private Point2D middle;
//	private Rectangle2D area;
	
	public Cell (Point2D point) {
//		middle = point;
//		this.setArea(new Rectangle2D.Double(middle.getX() - 1, middle.getY() - 1, 2, 2));
		occupyer = null;
		bombed = false;
	}

//	public Point2D getMiddle() {
//		return middle;
//	}

	public boolean isBombed() {
		return bombed;
	}
	
	public boolean bomb() throws Exception {
		if(bombed) {
			throw new Exception();
		}
		bombed = true;
		if(occupyer == null) {
			return false;
		}
		return true;
	}

	public void setShip(Ship ship) {
		occupyer = ship;
	}
//	
//	public boolean isNeighbour(Field toCheck) {
//		return middle.distance(toCheck.getMiddle()) == 1;
//	}
//
//	public Rectangle2D getArea() {
//		return area;
//	}
//
//	public void setArea(Rectangle2D area) {
//		this.area = area;
//	}

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