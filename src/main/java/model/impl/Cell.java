package model.impl;

import model.ICell;
import model.Enums.CellStatus;

public class Cell implements ICell {

	private CellStatus status;
	private Ship ship;
	private Coordinate coord;

	public Cell(Coordinate coord) {
		ship = null;
		this.coord = coord;
		status = CellStatus.WATER;
	}
	public Cell(CellStatus status, Coordinate coord) {
		ship = null;
		this.coord = coord;
		this.status = status;
	}

	@Override
	public void setStatus(CellStatus status) {
		this.status = status;
	}
	public CellStatus getStatus() {
		return status;
	}

	@Override
	public void setShip(Ship ship) {
		this.ship = ship;
	}

	@Override
	public Ship getShip() {
		return ship;
	}

	@Override
	public boolean hasShip() {
		return ship != null;
	}

	@Override
	public void clear() {
		ship = null;
		status = CellStatus.UNKNOWN;
	}

	@Override
	public Coordinate getCoordinate() {
		return null;
	}
}