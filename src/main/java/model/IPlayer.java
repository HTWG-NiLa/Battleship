package model;

import model.impl.Ship;

public interface IPlayer {
	
	String getName();
	
	void setName(String name);
	
	Ship[] getShips();

}