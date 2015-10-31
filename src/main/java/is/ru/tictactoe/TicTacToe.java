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

	//Create game with two players
	public TicTacToe(String s1, String s2) {
		board = new char[3][3];
		clearBoard();

		player1 = new HumanPlayer(s1, 'x');
		player2 = new HumanPlayer(s2, 'o');
		currentPlayer = player1;
	}

	//Create game with player against computer
	public TicTacToe(String s1) {
		board = new char[3][3];
		clearBoard();

		player1 = new HumanPlayer(s1, 'x');
		player2 = new ComputerPlayer("Computer", 'o');
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
		

	private boolean isBoardFull() {

		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				
				if(board[x][y] == ' '){
					return false;
				}
			}
		}
		return true;
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
		 //System.out.println(WhoseTurnIsIt() + " it's your turn!");
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


	// return 0 for no win
	// return 1 for player1 won
	// return 2 for plauer2 won
	// return 3 for tie
	public int checkForWin() {
		int status = 0;

		if(isBoardFull()) {
			return 3;
		}

		status = checkHorizontal();

		if(status != 0) {
			return status;
		}
		else {
			status = checkVertical();
		}

		if(status != 0) {
			return status;
		}
		else {
			status = checkDiagonal();
		}

		return status;
	}


	private int checkHorizontal() {

		for(int y = 0; y < 3; y++) {
			if(board[0][y] == board[1][y] && board[1][y] == board[2][y]) {
				if(board[0][y] != ' ') {
					if(board[0][y] == 'x') {
						return 1;
					}
					else {
						return 2;
					}
				}
			}
		}

		return 0;
	}

	private int checkVertical() {

		for(int x = 0; x < 3; x++) {
			if(board[x][0] == board[x][1] && board[x][1] == board[x][2]) {
				if(board[x][0] != ' ') {
					if(board[x][0] == 'x') {
						return 1;
					}
					else {
						return 2;
					}
				}
			}
		}

		return 0;
	}

	private int checkDiagonal() {

		if(board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			if(board[0][0] != ' ') {
					if(board[0][0] == 'x') {
						return 1;
					}
					else {
						return 2;
					}
			}
		}

		if(board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
			if(board[2][0] != ' ') {
					if(board[2][0] == 'x') {
						return 1;
					}
					else {
						return 2;
					}
			}
		}

		return 0;
	}
}