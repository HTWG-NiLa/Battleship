package model;

import model.Enums.CellStatus;
import model.impl.Cell;
import model.impl.Coordinate;

/**
 * Created by knl1imb on 23.02.2016.
 */
public abstract class Board {
    private Cell[][] grid;

    public Board (int length, int width) {
        grid = new Cell[length][width];
        for (int x = 0; x < length; x++) {
            for (int y = 0; y < length; y++) {
                grid[x][y] = new Cell(CellStatus.WATER);
            }
        }
    }

    public Cell getCell(Coordinate coord) {
        return grid[coord.getX()][coord.getY()];
    }

    public Cell getCell(int x, int y) {
        return grid[x][y];
    }

    public void setStatus(CellStatus status, Coordinate coord) {
        grid[coord.getX()][coord.getY()].setStatus(status);
    }
}
