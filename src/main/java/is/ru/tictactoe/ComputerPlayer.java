package is.ru.tictactoe;

import java.util.Random;

public class ComputerPlayer extends Player {

	public ComputerPlayer(String name, char marker) {
		super(name, marker);
	}

	// Get random coordinates from computer.
	// Validation for the location having to be empty, or computer tries again.
	public Coordinates getMove(char[][] board) {
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
		char mark;
		if(super.marker == 'x') {
			mark = 'o';
		}
		else {
			mark = 'x';
		}

		// Check if computer can win on 3 row
		for(int i = 0; i < 2; i++) {
			if(board[i][0] == board[i][1] && board[i][0] == mark && board[i][2] == ' ') {
				move = new Coordinates(i,2);
				return move;
			}
		}

		// Check if computer can win on 2 row
		for(int i = 0; i < 2; i++) {
			if(board[i][0] == board[i][2] && board[i][0] == mark && board[i][1] == ' ') {
				move = new Coordinates(i,1);
				return move;
			}
		}

		// Check if computer can win on 1 row
		for(int i = 0; i < 2; i++) {
			if(board[i][1] == board[i][2] && board[i][1] == mark && board[i][0] == ' ') {
				move = new Coordinates(0,i);
				return move;
			}
		}

		move = new Coordinates(3,3);

		return move;
	}
}