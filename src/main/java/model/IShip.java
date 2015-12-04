package model;

import java.util.List;

import model.impl.Cell;

public interface IShip {
	
	boolean isDestroyed();
	
	void setCells(List<Cell> cells);
	
	List<Cell> getCells();
	
	int getLength();

}
