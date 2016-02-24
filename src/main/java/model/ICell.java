package model;

import model.Enums.CellStatus;
import model.impl.Ship;

public interface ICell {

	void setStatus(CellStatus status);
	CellStatus getStatus();
	void setShip(Ship ship);
	Ship getShip();
	boolean hasShip();
	void clear();

}