package model.impl;

import model.Board;
import model.Enums.CellStatus;

/**
 * Created by knl1imb on 23.02.2016.
 */
public class HomeBoard extends Board {

    private Fleet fleet;

    public HomeBoard(int length, int width) {
        super(length, width);
    }

    public HomeBoard(int length, int width, Fleet fleet) {
        super(length, width);
        this.fleet = fleet;
    }

    public boolean placeShip(Ship ship, Coordinate coord, boolean vertical) {
        int x = coord.getX();
        int y = coord.getY();
        Cell destination = super.getCell(x, y);
        if (!destination.getStatus().equals(CellStatus.WATER)) {
            return false;
        }
        if (vertical) {
            for(int i = 0; i < ship.getLength(); i++) {
                if(!placeShip(ship, x, y + i)) {
                    return false;
                }
            }
        } else {
            for(int i = 0; i < ship.getLength(); i++) {
                if(!placeShip(ship, x + i, y)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean placeShip(Ship ship, int x, int y) {
        try {
            Cell cell = super.getCell(x, y);
            if(cell.getStatus().equals(CellStatus.WATER)) {
                return false;
            }
            cell.setStatus(CellStatus.SHIP);
            cell.setShip(ship);
            ship.addCoordinate(new Coordinate(x, y));
            return true;
        } catch (ArrayIndexOutOfBoundsException ex) {
            return false;
        }
    }
}
