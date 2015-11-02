package is.ru.tictactoe;

import java.util.Random;

public class ComputerPlayer extends Player {

	public ComputerPlayer(String name, char marker) {
		super(name, marker);
	}

	public char checkMarker() {
		return super.marker;
	}

	public Coordinates getMove(char[][] board) {
		Coordinates invalidMove = new Coordinates(3,3);

		// Check for winning chance
		if(!checkHorizontal(board, super.marker).equals(invalidMove)) {
			return checkHorizontal(board, super.marker);
		}
		else if(!checkVertical(board, super.marker).equals(invalidMove)) {
			return checkVertical(board, super.marker);
		}
		else if(!checkDiagonal(board, super.marker).equals(invalidMove)) {
			return checkDiagonal(board, super.marker);
		}

		// Get opponents marker
		char opponent;
		if(super.marker == 'o') {
			opponent = 'x';
		}
		else {
			opponent = 'o';
		}

		// Prevent other player from winning
		if(!checkHorizontal(board, opponent).equals(invalidMove)) {
			return checkHorizontal(board, opponent);
		}
		else if(!checkVertical(board, opponent).equals(invalidMove)) {
			return checkVertical(board, opponent);
		}
		else if(!checkDiagonal(board, opponent).equals(invalidMove)) {
			return checkDiagonal(board, opponent);
		}		
		
		return getRandomCoord(board);
	}


	// Get random coordinates from computer.
	// Validation for the location having to be empty, or computer tries again.
	private Coordinates getRandomCoord(char[][] board) {
		Random rand = new Random();
		int x = -1;
		int y = -1;
		while(true) {
			x = rand.nextInt(3);
			y = rand.nextInt(3);
			
			if(board[x][y] == ' ') {
				board[x][y] = super.marker;
				break;
			}
		}

		Coordinates move = new Coordinates(x,y);

		return move;
	}

	// Check all possibilities of winning in horizontal line
	private Coordinates checkHorizontal(char[][] board, char mark) {
		Coordinates move;

		//Check if computer can win on 3 row
		for(int i = 0; i <= 2; i++) {
			if(board[0][i] == board[1][i] && board[0][i] == mark && board[2][i] == ' ') {
				move = new Coordinates(2,i);
				return move;
			}
		}

		//Check if computer can win on 2 row
		for(int i = 0; i <= 2; i++) {
			if(board[0][i] == board[2][i] && board[0][i] == mark && board[1][i] == ' ') {
				move = new Coordinates(1,i);
				return move;
			}
		}

		//Check if computer can win on 1 row
		for(int i = 0; i <= 2; i++) {
			if(board[1][i] == board[2][i] && board[1][i] == mark && board[0][i] == ' ') {
				move = new Coordinates(0,i);
				return move;
			}
		}

		move = new Coordinates(3,3);

		return move;
	}

	// Check all possibilities of winning in vertical line
	private Coordinates checkVertical(char[][] board, char mark) {
		Coordinates move;

		//Check if computer can win on 3 row
		for(int i = 0; i <= 2; i++) {
			if(board[i][0] == board[i][1] && board[i][0] == mark && board[i][2] == ' ') {
				move = new Coordinates(i,2);
				return move;
			}
		}

		//Check if computer can win on 2 row
		for(int i = 0; i <= 2; i++) {
			if(board[i][0] == board[i][2] && board[i][0] == mark && board[i][1] == ' ') {
				move = new Coordinates(i,1);
				return move;
			}
		}

		//Check if computer can win on 1 row
		for(int i = 0; i <= 2; i++) {
			if(board[i][1] == board[i][2] && board[i][1] == mark && board[i][0] == ' ') {
				move = new Coordinates(i,0);
				return move;
			}
		}

		move = new Coordinates(3,3);

		return move;
	}

	// Check all possibilities of winning diagonally
	private Coordinates checkDiagonal(char[][] board, char mark) {
		Coordinates move;

		if(board[0][0] == board[1][1] && board[0][0] == mark && board[2][2] == ' ') {
			move = new Coordinates(2,2);
			return move;
		}

		if(board[0][0] == board[2][2] && board[0][0] == mark && board[1][1] == ' ') {
			move = new Coordinates(1,1);
			return move;
		}

		if(board[1][1] == board[2][2] && board[1][1] == mark && board[0][0] == ' ') {
			move = new Coordinates(0,0);
			return move;
		}

		if(board[0][2] == board[1][1] && board[0][2] == mark && board[2][0] == ' ') {
			move = new Coordinates(2,0);
			return move;
		}

		if(board[0][2] == board[2][0] && board[0][2] == mark && board[1][1] == ' ') {
			move = new Coordinates(1,1);
			return move;
		}

		if(board[1][1] == board[2][0] && board[1][1] == mark && board[0][2] == ' ') {
			move = new Coordinates(0,2);
			return move;
		}

		move = new Coordinates(3,3);

		return move;
	}
}