package model.impl;

import java.util.List;

/**
 * Created by knl1imb on 23.02.2016.
 */
public class Fleet {
    private List<Ship> ships;

    public Fleet(List<Ship> ships) {
        this.ships = ships;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void addShip(Ship ship) {
        assert ship != null;
        ships.add(ship);
    }
}
