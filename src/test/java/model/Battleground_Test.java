package test.java.model;

import static org.junit.Assert.assertEquals;

import java.awt.Point;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.java.model.Enums.CellStatus;
import main.java.model.Enums.Orientation;
import main.java.model.impl.Battleground;
import main.java.model.impl.Cell;
import main.java.model.impl.Ship;

public class Battleground_Test {
	
	private Battleground testee;
	private Ship ship;
	
	@Before
	public void init() {
		testee = new Battleground(10);
		ship = new Ship(Orientation.HORIZONTAL, 5);
	}
	
	@Test
	public void adding_a_ship_to_valid_position_is_successfull() {
		testee.addShip(ship, new Point(0,0));
		List<Cell> ship_cells = ship.getCells();
		for(int i = 0; i < ship.getLength(); i++) {
			assertEquals(ship_cells.get(i).getY(), i);
			assertEquals(ship_cells.get(i).getX(), 0);
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void adding_a_ship_to_invalid_position_throws_exception() {
		testee.addShip(ship, new Point(10, 10));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void adding_a_ship_with_to_much_length_to_a_valid_position_throws_exception() {
		testee.addShip(ship, new Point(5,5));
	}
	
	@Test
	public void bombing_a_cell_with_a_ship_returns_status_Bombed() {
		testee.addShip(ship, new Point(1, 1));
		CellStatus status = testee.bomb(new Point(1, 2));
		assertEquals(status, CellStatus.BOMBED);
	}
	
	@Test
	public void bombing_an_empty_cell_returns_status_Empty() {
		CellStatus status = testee.bomb(new Point(1,2));
		assertEquals(status, CellStatus.EMPTY);
	}
	
	@Test
	public void destroying_a_ship_returns_status_destroyed() {
		testee.addShip(new Ship(Orientation.HORIZONTAL, 1), new Point(0, 0));
		CellStatus status = testee.bomb(new Point(0, 0));
		assertEquals(status, CellStatus.DESTROYED);
	}
}
