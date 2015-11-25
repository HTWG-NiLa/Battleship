package main.java.model;

import main.java.model.impl.Ship;

public interface IPlayer {
	
	String getName();
	
	void setName(String name);
	
	Ship[] getShips();

}