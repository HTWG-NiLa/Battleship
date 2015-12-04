package model;

import java.awt.Point;

import model.Enums.CellStatus;
import model.impl.Ship;

public interface IBattleground {
	
	void addShip(Ship ship, Point destination);
	CellStatus bomb(Point destination);

}