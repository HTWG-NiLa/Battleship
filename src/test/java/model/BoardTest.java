package model;

import model.Enums.CellStatus;
import model.impl.Board;
import model.impl.Coordinate;
import model.impl.Player;
import model.impl.Ship;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by knl1imb on 24.02.2016.
 */
public class BoardTest {

    private Board board;
    private Player player;

    @Before
    public void init() {
        board = new Board(5, 5, null);
        player = new Player("player1", board);
        board.setOwner(player);
    }

    @Test
    public void board_has_correct_cells() {
        Board board = new Board(5, 5, null);
        Assert.assertNotNull(board.getCell(0, 0));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void throw_exception_when_requested_Cell_not_on_board() {
        board.getCell(6, 6);
    }

    @Test
    public void set_status() {
        Coordinate coord = new Coordinate(1, 1);
        CellStatus status = CellStatus.SHIP;
        board.setStatus(status, coord);
        Assert.assertEquals(status, board.getCell(coord).getStatus());
    }

    @Test
    public void set_vertical_ship() {
        Assert.assertTrue(board.placeShip(player, new Ship(3), new Coordinate(0, 0), true));
        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(CellStatus.SHIP, board.getCell(0, i).getStatus());
        }
        Assert.assertEquals(CellStatus.WATER, board.getCell(0, 4).getStatus());
        Assert.assertEquals(CellStatus.WATER, board.getCell(1, 0).getStatus());
    }

    @Test
    public void set_horizontal_ship() {
        Assert.assertTrue(board.placeShip(player, new Ship(3), new Coordinate(0, 0), false));
        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(CellStatus.SHIP, board.getCell(i, 0).getStatus());
        }
        Assert.assertEquals(CellStatus.WATER, board.getCell(4, 0).getStatus());
        Assert.assertEquals(CellStatus.WATER, board.getCell(0, 1).getStatus());
    }

    @Test
    public void set_vertical_ship_which_exceeds_board() {
        Assert.assertFalse(board.placeShip(player, new Ship(6), new Coordinate(0, 0), true));
        for (int i = 0; i < 5; i++) {
            Assert.assertEquals(CellStatus.WATER, board.getCell(0, i).getStatus());
        }
    }

    @Test
    public void set_horizontal_ship_which_exceeds_board() {
        Assert.assertFalse(board.placeShip(player, new Ship(6), new Coordinate(0, 0), false));
        for (int i = 0; i < 5; i++) {
            Assert.assertEquals(CellStatus.WATER, board.getCell(i, 0).getStatus());
        }
    }

    @Test
    public void set_two_ships_across() {
        Assert.assertTrue(board.placeShip(player, new Ship(5), new Coordinate(0, 0), true));
        Assert.assertFalse(board.placeShip(player, new Ship(5), new Coordinate(1, 0), false));
        for (int i = 0; i < 5; i++) {
            Assert.assertEquals(CellStatus.SHIP, board.getCell(0, i).getStatus());
        }
    }

}
