package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
    }

    @Test
    public void getNameTest() {
    	Player P1 = new Player("Steven", 'X');

    	assertEquals("Steven", P1.getName());
    }

	@Test
    public void getNumberOfWinsTest() {
    	Player P1 = new Player("Steven", 'X');

    	//Player starts with zero wins
    	assertEquals(0, P1.getNumberOfWins());
    }

    @Test
    public void playerWinsTest() {
    	Player P1 = new Player("Steven", 'X');
    	P1.playerWon();

    	assertEquals(1, P1.getNumberOfWins());
    }

    @Test
    public void playerMultipleWinsTest() {
    	Player P1 = new Player("Steven", 'X');
    	P1.playerWon();
    	P1.playerWon();
    	P1.playerWon();

    	assertEquals(3, P1.getNumberOfWins());
    }
}