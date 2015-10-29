package is.ru.tictactoe;

public class TicTacToe {

	private char[][] board;
	private char currentPlayer;
	private Player player1, player2;

	public TicTacToe() {
		board = new char[3][3];
		player1 = new HumanPlayer();
		player2 = new HumanPlayer()
		initializeBoard();
	}

	public static char[][] initializeBoard() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
	}

	public static char[][] printBoard() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				system.out.print(board[i][j] + " ");
			}
			system.out.println();
		}
	}		


	private static int toInt(String number){
		return Integer.parseInt(number);
	}
}