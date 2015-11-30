package main.java.model;

import java.awt.Point;

import main.java.model.Enums.CellStatus;
import main.java.model.impl.Ship;

public interface IBattleground {
	
	void addShip(Ship ship, Point destination);
	CellStatus bomb(Point destination);

}