package test.java.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.awt.Point;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.model.impl.Battleground;
import main.java.model.impl.Cell;
import main.java.model.impl.Ship;

public class Battleground_Test {
	
	private Battleground testee;
	private Ship ship;
	
	@Before
	public void init() {
		testee = new Battleground(10);
		ship = new Ship(true, 5);
	}
	
	@Test
	public void adding_a_ship_to_valid_position_is_successfull() {
		testee.addShip(ship, new Point(0,0));
		Cell[] ship_cells = ship.getCells();
		for(int i = 0; i < ship.getLength(); i++) {
			assertEquals(ship_cells[i].getY(), 0);
			assertEquals(ship_cells[i].getX(), i);
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void adding_a_ship_to_invalid_position_throws_exception() {
		testee.addShip(ship, new Point(10, 10));
	}
	
	@Test
	public void bombing_a_cell_with_a_ship_returns_true() {
		testee.addShip(ship, new Point(1, 1));
		Assert.assertTrue(testee.bomb(new Point(2, 1)));
	}

}
