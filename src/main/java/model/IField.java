package main.java.model;

import java.awt.geom.Point2D;

import main.java.model.impl.Ship;

public interface IField {

//	Point2D getMiddle();
	boolean isBombed();
	boolean bomb() throws Exception;
	void setShip(Ship ship);
	void setX(int x);
	void setY(int y);
}