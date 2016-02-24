package model;

import java.util.List;

import model.impl.Cell;
import model.impl.Coordinate;

public interface IShip {
	
	void addCoordinate(Coordinate coord);
	
	List<Coordinate> getCoordinates();
	
	int getLength();

}
