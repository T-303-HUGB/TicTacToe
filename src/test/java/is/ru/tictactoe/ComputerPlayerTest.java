package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComputerPlayerTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
    }

    @Test
    public void getNameTest() {
    	ComputerPlayer P1 = new ComputerPlayer("HAL9000", 'o');

    	assertEquals("HAL9000", P1.getName());
    }

    @Test
    public void checkSuperMarker() {
        ComputerPlayer P1 = new ComputerPlayer("HAL9000", 'o');

        assertEquals('o', P1.checkMarker());
    }

    @Test
    public void checkHorizontalTest() {
        ComputerPlayer P1 = new ComputerPlayer("HAL9000", 'o');
        TicTacToe game = new TicTacToe("Kakli");

        Coordinates coord = new Coordinates(0,0);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(0,1);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(1,2);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(2,1);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(2,2);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(1,1);

        assertEquals(true, coord.equals(P1.getMove(game.getBoard())));
    }

    @Test
    public void checkHorizontal2Test() {
        ComputerPlayer P1 = new ComputerPlayer("HAL9000", 'o');
        TicTacToe game = new TicTacToe("Kakli");

        Coordinates coord = new Coordinates(0,0);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(2,2);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(2,0);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(1,2);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(1,1);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(0,2);

        assertEquals(true, coord.equals(P1.getMove(game.getBoard())));
    }

    @Test
    public void checkHorizontal3Test() {
        ComputerPlayer P1 = new ComputerPlayer("HAL9000", 'o');
        TicTacToe game = new TicTacToe("Kakli");

        Coordinates coord = new Coordinates(2,2);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(0,0);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(2,1);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(1,0);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(1,1);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(2,0);

        assertEquals(true, coord.equals(P1.getMove(game.getBoard())));
    }

    @Test
    public void checkVerticalTest() {
        ComputerPlayer P1 = new ComputerPlayer("HAL9000", 'o');
        TicTacToe game = new TicTacToe("Kakli");

        Coordinates coord = new Coordinates(1,2);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(0,0);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(1,1);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(0,1);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(2,0);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(0,2);

        assertEquals(true, coord.equals(P1.getMove(game.getBoard())));
    }

    @Test
    public void checkVerticalTest2() {
        ComputerPlayer P1 = new ComputerPlayer("HAL9000", 'o');
        TicTacToe game = new TicTacToe("Kakli");

        Coordinates coord = new Coordinates(0,0);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(1,0);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(2,0);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(1,2);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(0,2);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(1,1);

        assertEquals(true, coord.equals(P1.getMove(game.getBoard())));
    }

    @Test
    public void checkVerticalTest3() {
        ComputerPlayer P1 = new ComputerPlayer("HAL9000", 'o');
        TicTacToe game = new TicTacToe("Kakli");

        Coordinates coord = new Coordinates(0,0);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(2,1);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(0,1);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(2,2);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(1,0);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(2,0);

        assertEquals(true, coord.equals(P1.getMove(game.getBoard())));
    }

    @Test
    public void checkDiagonalTest() {
        ComputerPlayer P1 = new ComputerPlayer("HAL9000", 'o');
        TicTacToe game = new TicTacToe("Kakli");

        Coordinates coord = new Coordinates(1,0);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(0,0);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(0,1);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(1,1);
        game.playersTurn(coord); //To get o turn
        coord = new Coordinates(2,1);
        game.playersTurn(coord); //To get x turn
        coord = new Coordinates(2,2);

        assertEquals(true, coord.equals(P1.getMove(game.getBoard())));
    }
}