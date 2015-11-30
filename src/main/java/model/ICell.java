package main.java.model;

import main.java.model.Enums.CellStatus;

public interface ICell {

	CellStatus bomb();
	boolean isBombed();
	void setX(int x);
	void setY(int y);
}