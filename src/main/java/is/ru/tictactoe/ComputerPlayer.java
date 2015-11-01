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

		if(!checkHorizontal(board).equals(invalidMove)) {
			return checkHorizontal(board);
		}
		else if(!checkVertical(board).equals(invalidMove)) {
			return checkVertical(board);
		}
		else if(!checkDiagonal(board).equals(invalidMove)) {
			return checkDiagonal(board);
		}
		
		return getRandomCoord(board);
	}


	// Get random coordinates from computer.
	// Validation for the location having to be empty, or computer tries again.
	private Coordinates getRandomCoord(char[][] board) {
		Random rand = new Random();
		int x = -1, y = -1;
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

	public Coordinates checkHorizontal(char[][] board) {
		Coordinates move;

		//Check if computer can win on 3 row
		for(int i = 0; i <= 2; i++) {
			if(board[0][i] == board[1][i] && board[0][i] == super.marker && board[2][i] == ' ') {
				move = new Coordinates(2,i);
				return move;
			}
		}

		//Check if computer can win on 2 row
		for(int i = 0; i <= 2; i++) {
			if(board[0][i] == board[2][i] && board[0][i] == super.marker && board[1][i] == ' ') {
				move = new Coordinates(1,i);
				return move;
			}
		}

		//Check if computer can win on 1 row
		for(int i = 0; i <= 2; i++) {
			if(board[1][i] == board[2][i] && board[1][i] == super.marker && board[0][i] == ' ') {
				move = new Coordinates(0,i);
				return move;
			}
		}
		
		move = new Coordinates(3,3);

		return move;
	}

	public Coordinates checkVertical(char[][] board) {
		Coordinates move;

		//Check if computer can win on 3 row
		for(int i = 0; i <= 2; i++) {
			if(board[i][0] == board[i][1] && board[i][0] == super.marker && board[i][2] == ' ') {
				move = new Coordinates(i,2);
				return move;
			}
		}

		//Check if computer can win on 2 row
		for(int i = 0; i <= 2; i++) {
			if(board[i][0] == board[i][2] && board[i][0] == super.marker && board[i][1] == ' ') {
				move = new Coordinates(i,1);
				return move;
			}
		}

		//Check if computer can win on 1 row
		for(int i = 0; i <= 2; i++) {
			if(board[i][1] == board[i][2] && board[i][1] == super.marker && board[i][0] == ' ') {
				move = new Coordinates(i,0);
				return move;
			}
		}

		move = new Coordinates(3,3);

		return move;
	}

	public Coordinates checkDiagonal(char[][] board) {
		Coordinates move;

		if(board[0][0] == board[1][1] && board[0][0] == super.marker && board[2][2] == ' ') {
			move = new Coordinates(2,2);
			return move;
		}

		if(board[0][0] == board[2][2] && board[0][0] == super.marker && board[1][1] == ' ') {
			move = new Coordinates(1,1);
			return move;
		}

		if(board[1][1] == board[2][2] && board[1][1] == super.marker && board[0][0] == ' ') {
			move = new Coordinates(0,0);
			return move;
		}

		if(board[0][2] == board[1][1] && board[0][2] == super.marker && board[2][0] == ' ') {
			move = new Coordinates(2,0);
			return move;
		}

		if(board[0][2] == board[2][0] && board[0][2] == super.marker && board[1][1] == ' ') {
			move = new Coordinates(1,1);
			return move;
		}

		if(board[1][1] == board[2][0] && board[1][1] == super.marker && board[0][2] == ' ') {
			move = new Coordinates(0,2);
			return move;
		}

		move = new Coordinates(3,3);

		return move;
	}
}