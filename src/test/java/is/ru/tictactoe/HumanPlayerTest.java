package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanPlayerTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
    }

    @Test
    public void getNameTest() {
    	HumanPlayer P1 = new HumanPlayer("Steve", 'X');

    	assertEquals("Steve", P1.getName());
    }

}