package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComputerPlayerTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
    }

    @Test
    public void getNameTest() {
    	ComputerPlayer P1 = new ComputerPlayer("HAL9000", 'O');

    	assertEquals("HAL9000", P1.getName());
    }

    @Test
    public void checkHorizontalFailureTest() {
        ComputerPlayer P1 = new ComputerPlayer("HAL9000", 'X');
        Coordinates coord = new Coordinates(3,3);
        char[][] board = new char[3][3];

        assertEquals(true, coord.equals(P1.checkHorizontal(board)));
    }

    @Test
    public void checkHorizontalTest() {
        ComputerPlayer P1 = new ComputerPlayer("HAL9000", 'X');
        Coordinates coord = new Coordinates(0,0);
        Coordinates coordH = new Coordinates(2,2);
        Coordinates coord2 = new Coordinates(0,1);
        Coordinates coord3 = new Coordinates(0,2);
        TicTacToe game = new TicTacToe();
        game.playersTurn(coord);
        game.playersTurn(coordH); //To get o turn
        game.playersTurn(coord2);

        assertEquals(true, coord3.equals(P1.checkHorizontal(game.getBoard())));
    }
}