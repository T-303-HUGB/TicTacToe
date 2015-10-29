package is.ru.tictactoe;

public class TicTacToe {

	private char[][] board;
	private Player player1, player2;

	public TicTacToe() {
		board = new char[3][3];
		//player1 = new HumanPlayer();
		//player2 = new HumanPlayer();
		initializeBoard();
	}

	public static void initializeBoard() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				//board[i][j] = '-';
			}
		}
	}

	public static void printBoard() {
		//system.out.println("-------------");

		for(int i = 0; i < 3; i++) {
			//System.print.out("| ");

			for(int j = 0; j < 3; j++) {
				//system.out.print(board[i][j] + " | ");
			}
			//system.out.println();
			//system.out.println();
			//system.out.println("-------------");
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
}