package model.impl;

import model.IBoard;
import model.IPlayer;

import java.util.ArrayList;
import java.util.List;

public class Player implements IPlayer {
	
	private String name;

	private Board home;

	private Board enemy;

	private Fleet fleet;

	public Player(String name, IBoard board) {
		this.name = name;
		home = (Board) board;
		initFleet();
	}
	
	private void initFleet() {
		List <Ship> list = new ArrayList<>();
		list.add(new Ship(5));
		list.add(new Ship(4));
		list.add(new Ship(3));
		list.add(new Ship(3));
		list.add(new Ship(2));
		fleet = new Fleet(list);
	}

	public String getName() {
		return name;
	}

	public Fleet getFleet() {
		return fleet;
	}

	@Override
	public void setEnemyBoard(IBoard board) {
		enemy = (Board) board;
	}

	@Override
	public Board getHomeBoard() {
		return home;
	}

	@Override
	public Board getEnemyBoard() {
		return enemy;
	}

}
