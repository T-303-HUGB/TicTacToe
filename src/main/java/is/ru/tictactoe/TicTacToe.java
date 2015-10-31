package is.ru.tictactoe;

import static java.lang.System.out;

public class TicTacToe {

	private static char[][] board;
	private Player player1, player2;
	private Player currentPlayer;

	public TicTacToe() {
		board = new char[3][3];
		clearBoard();

		player1 = new HumanPlayer("Player 1", 'x');
		player2 = new HumanPlayer("Player 2", 'o');
		currentPlayer = player1;
	}

	public TicTacToe(String s1, String s2) {
		board = new char[3][3];
		clearBoard();

		player1 = new HumanPlayer(s1, 'x');
		player2 = new HumanPlayer(s2, 'o');
		currentPlayer = player1;
	}

	private void clearBoard() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}

	public static void printBoard() {
		System.out.println();

		for(int i = 0; i < 3; i++) {
			System.out.print(" |");

			for(int j = 0; j < 3; j++) {
					System.out.print(board[i][j]);

				if(j < 3) {
					System.out.print("|");
				}
			}
			System.out.println();
		}
	}
		

	public boolean isBoardFull() {
		boolean full = true;

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				if(board[i][j] == '-'){
					full = false;
				}
			}
		}
		return full;
	}

	public String WhoseTurnIsIt() {
		return currentPlayer.getName();
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public char[][] getBoard() {
		return board;
	}


	public void playersTurn(Coordinates coords) {
		 System.out.println(WhoseTurnIsIt() + " it's your turn!");
		 board[coords.x()][coords.y()] = currentPlayer.marker;
		 switchPlayer();
	}

	public void switchPlayer() {
		 if(currentPlayer == player1) {
		 	currentPlayer = player2;
		 }
		 else {
		 	currentPlayer = player1;
		 }
	}
}