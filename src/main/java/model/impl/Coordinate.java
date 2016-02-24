package model.impl;

import model.ICoordinate;

import java.awt.*;

/**
 * Created by knl1imb on 23.02.2016.
 */
public class Coordinate implements ICoordinate{
    private Point point;
    public Coordinate(int x, int y) {
        point = new Point(x,y);
    }
    public int getX() {
        return point.x;
    }
    public int getY() {
        return point.y;
    }
}
