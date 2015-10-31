package is.ru.tictactoe;

public class ComputerPlayer extends Player {

	public ComputerPlayer(String name, char marker) {
		super(name, marker);
	}

	public Coordinates getMove(char[][] board) {
		Coordinates invalidMove = new Coordinates(3,3);

		if(checkHorizontal(board) != invalidMove) {
			return checkHorizontal(board);
		}

		return invalidMove;
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

		//Check if computer can win on 3 row
		for(int i = 0; i < 2; i++) {
			if(board[i][0] == board[i][1] && board[i][0] == mark && board[i][2] == ' ') {
				move = new Coordinates(i,2);
				return move;
			}
		}

		//Check if computer can win on 2 row
		for(int i = 0; i < 2; i++) {
			if(board[i][0] == board[i][2] && board[i][0] == mark && board[i][1] == ' ') {
				move = new Coordinates(i,1);
				return move;
			}
		}

		//Check if computer can win on 1 row
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