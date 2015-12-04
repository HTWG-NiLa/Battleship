package model;

import model.Enums.CellStatus;

public interface ICell {

	CellStatus bomb();
	boolean isBombed();
	void setX(int x);
	void setY(int y);
}