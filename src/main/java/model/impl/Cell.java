package model.impl;

import java.awt.geom.Point2D;

import model.ICell;
import model.Enums.CellStatus;

public class Cell implements ICell {

	private CellStatus status;
	private Ship occupyer;
	private int x;
	private int y;

	public Cell(Point2D point) {
		status = CellStatus.EMPTY;
		occupyer = null;
		x = (int) point.getX();
		y = (int) point.getY();
	}
	
	public CellStatus bomb() {
		if(status == CellStatus.BOMBED || status == CellStatus.DESTROYED) {
			return CellStatus.INVALID;
		} else if(status == CellStatus.EMPTY){
			return CellStatus.EMPTY;
		} else {
			status = CellStatus.BOMBED;
			return (occupyer.isDestroyed()) ? CellStatus.DESTROYED : CellStatus.BOMBED;
		}
	}
	
	public boolean isBombed() {
		return status == CellStatus.BOMBED;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Ship getOccupyer() {
		return occupyer;
	}

	public void setOccupyer(Ship occupyer) {
		this.occupyer = occupyer;
		status = CellStatus.OCCUPIED;
	}

}