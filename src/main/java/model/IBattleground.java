package main.java.model;

import main.java.model.impl.Field;
import main.java.model.impl.Ship;

public interface IBattleground {
	
	void addShip(Ship ship, Field destination, int orientation);

}