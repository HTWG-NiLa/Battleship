package model;

import model.impl.Board;
import model.impl.Fleet;

public interface IPlayer {
	
	String getName();
	
	Fleet getFleet();

	void setEnemyBoard(IBoard board1);

	IBoard getHomeBoard();
	IBoard getEnemyBoard();
}