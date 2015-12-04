package model.impl;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	private List<Ship> ships_of_player;
	
	public Player(String name) {
		this.name = name;
		init_ship_list(ships_of_player);
	}
	
	private void init_ship_list(List<Ship> list) {
		list = new ArrayList<Ship>();
		list.add(new Ship(5));
		list.add(new Ship(4));
		list.add(new Ship(3));
		list.add(new Ship(3));
		list.add(new Ship(2));
	}

	public String getName() {
		return name;
	}
	
}
