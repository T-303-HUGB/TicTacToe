package is.ru.tictactoe;

import static java.lang.System.out;

public class TicTacToe {

	private char[][] board;
	private Player player1, player2;
	private Player currentPlayer;

	public TicTacToe() {
		board = new char[3][3];
		player1 = new Player("Player 1");
		player2 = new Player("Player 2");
		currentPlayer = player1;
	}

	public static void printBoard() {
		System.out.println("-------------");

		for(int i = 0; i < 3; i++) {
			System.out.println("| ");

			for(int j = 0; j < 3; j++) {
					System.out.print("  ");

				if(j < 3) {
					System.out.println(" | ");
				}
			}
		}
		
		System.out.println("------");
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
}