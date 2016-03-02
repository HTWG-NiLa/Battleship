package model;

import java.util.List;

import model.impl.Cell;
import model.impl.Coordinate;

public interface IShip {
	
	List<ICell> getCells();
	
	int getLength();

}
