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
}