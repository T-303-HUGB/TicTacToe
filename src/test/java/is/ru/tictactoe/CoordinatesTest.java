package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CoordinatesTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
    }

    @Test
    public void getXTest() {
    	Coordinates coord = new Coordinates(1,2);

    	assertEquals(1, coord.x());
    }

    @Test
    public void getYTest() {
    	Coordinates coord = new Coordinates(1,2);

    	assertEquals(2, coord.y());
    }

    @Test
    public void CoordinatesEqualsTest() {
    	Coordinates coord = new Coordinates(1,1);
    	Coordinates coord2 = new Coordinates(1,1);

    	assertEquals(true, coord.equals(coord2));
    }

    @Test
    public void CoordinatesNotEqualsTest() {
    	Coordinates coord = new Coordinates(1,1);
    	Coordinates coord2 = new Coordinates(2,2);

    	assertEquals(false, coord.equals(coord2));
    }
}