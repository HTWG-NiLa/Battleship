package model;

import model.Enums.CellStatus;
import model.impl.Coordinate;
import model.impl.Ship;

public interface ICell {

	void setStatus(CellStatus status);
	CellStatus getStatus();
	void setShip(Ship ship);
	IShip getShip();
	boolean hasShip();
	void clear();

	ICoordinate getCoordinate();
}