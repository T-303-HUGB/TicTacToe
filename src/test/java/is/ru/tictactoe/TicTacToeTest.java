package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
    }

    @Test
    public void testWhichTurnItIs(){
        TicTacToe game = new TicTacToe();

        // player 1 should start
        //assertEquals(1, game.WhichTurn());
    }
}