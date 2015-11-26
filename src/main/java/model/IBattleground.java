package main.java.model;

import main.java.model.impl.Cell;
import main.java.model.impl.Ship;

public interface IBattleground {
	
	void addShip(Ship ship, Cell destination, int orientation);

}