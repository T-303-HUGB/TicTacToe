package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
    }

    @Test
    public void WhoseTurnItIsTest(){
        TicTacToe game = new TicTacToe();

        // player 1 should start
        assertEquals("Player 1", game.WhoseTurnIsIt());
    }

    @Test
    public void switchPlayer() {
        TicTacToe game = new TicTacToe();
        Coordinates coord = new Coordinates(1,1);
        game.playersTurn(coord);

        assertEquals("Player 2", game.WhoseTurnIsIt());
    }

    @Test
    public void checkIsBoardFullTest() {
        TicTacToe game = new TicTacToe();
        
        assertEquals(0, game.checkForWin());
    }

    @Test
    public void checkIsBoardFullTest2() {
        TicTacToe game = new TicTacToe();
        Coordinates coord = new Coordinates(0,0);
        game.playersTurn(coord);
        coord = new Coordinates(0,1);
        game.playersTurn(coord);
        coord = new Coordinates(0,2);
        game.playersTurn(coord);

        coord = new Coordinates(1,0);
        game.playersTurn(coord);
        coord = new Coordinates(1,1);
        game.playersTurn(coord);
        coord = new Coordinates(1,2);
        game.playersTurn(coord);
        
        coord = new Coordinates(2,0);
        game.playersTurn(coord);
        coord = new Coordinates(2,1);
        game.playersTurn(coord);
        coord = new Coordinates(2,2);
        game.playersTurn(coord);
        
        assertEquals(3, game.checkForWin());
    }

    @Test
    public void checkHorizontalTest() {
        TicTacToe game = new TicTacToe();
        Coordinates coord = new Coordinates(0,0);
        game.playersTurn(coord);
        coord = new Coordinates(2,1);
        game.playersTurn(coord);
        coord = new Coordinates(0,1);
        game.playersTurn(coord);
        coord = new Coordinates(2,2);
        game.playersTurn(coord);
        coord = new Coordinates(0,2);
        game.playersTurn(coord);

        assertEquals(1, game.checkForWin());
    }
}