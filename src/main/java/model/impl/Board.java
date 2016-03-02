package model.impl;

import model.*;
import model.Enums.CellStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by knl1imb on 23.02.2016.
 */
public class Board implements IBoard {

    private Player owner;
    private Fleet fleet;

    private Cell[][] grid;

    public Board(int length, int width, Fleet fleet) {
        grid = new Cell[length][width];
        for (int x = 0; x < length; x++) {
            for (int y = 0; y < length; y++) {
                grid[x][y] = new Cell(CellStatus.WATER, new Coordinate(x, y));
            }
        }
        this.fleet = fleet;
    }

    @Override
    public boolean placeShip(IPlayer player, IShip ship, ICoordinate coord, boolean vertical) {
        return placeShip(player, ship, coord, vertical);
    }

    @Override
    public ICell getCell(ICoordinate coord) {
        return getCell(coord);
    }

    @Override
    public Cell getCell(int x, int y) {
        return grid[x][y];
    }

    @Override
    public void setStatus(CellStatus status, Coordinate coord) {
        grid[coord.getX()][coord.getY()].setStatus(status);
    }

    @Override
    public void setOwner(Player player) {
        owner = player;
    }

    public Cell getCell(Coordinate coord) {
        return grid[coord.getX()][coord.getY()];
    }

    public boolean placeShip(Player player, Ship ship, Coordinate coord, boolean vertical) {
        if(!owner.equals(player)) {
            return false;
        }
        int x = coord.getX();
        int y = coord.getY();
        Cell destination = grid[x][y];
        assert isWater(destination);

        List<Cell> cells = new ArrayList<>();
        try{
            for(int i = 0; i < ship.getLength(); i++) {
                destination = grid[x][y];
                if(!isWater(destination)) {
                    return false;
                }
                cells.add(destination);
                if(vertical) {
                    y++;
                } else {
                    x++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            return false;
        }
        placeShip(ship, cells);
        return true;
    }



    private void placeShip(Ship ship, List<Cell> cells) {
        for (Cell c: cells) {
            c.setStatus(CellStatus.SHIP);
            c.setShip(ship);
            ship.addCell(c);
        }
    }

    private boolean isWater(Cell destination) {
        if (!destination.getStatus().equals(CellStatus.WATER)) {
            return false;
        }
        return true;
    }
}
