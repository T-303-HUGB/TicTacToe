package is.ru.tictactoe;

public class Game {

	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();

		while(true) {
			game.printBoard();
			game.playersTurn();
		}
		
	}
}