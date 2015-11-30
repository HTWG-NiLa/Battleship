package main.java.model;

public interface ICell {

//	Point2D getMiddle();
	boolean bomb();
	boolean isBombed();
	void setX(int x);
	void setY(int y);
}