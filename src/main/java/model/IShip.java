package main.java.model;

import java.util.List;

import main.java.model.impl.Cell;

public interface IShip {
	
	boolean isDestroyed();
	
	void setFields(List<Cell> cells);
	
	int getLength();

}
