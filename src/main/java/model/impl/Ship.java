package model.impl;

import java.util.ArrayList;
import java.util.List;

import model.IShip;

public class Ship implements IShip {
	
	private List<Coordinate> coords;
	private int length;
	
	public Ship(int length) {
		this.length = length;
		coords = new ArrayList<>(length);
	}

	@Override
	public void addCoordinate(Coordinate coord) {
		coords.add(coord);
	}


	@Override
	public List<Coordinate> getCoordinates() {
		return coords;
	}

	public int getLength() {
		return length;
	}

}