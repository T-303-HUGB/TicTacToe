package is.ru.tictactoe;

import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer(String name, char marker) {
		super(name, marker);
	}

	public Coordinates getMove(char[][] board) {
		Scanner input = new Scanner(System.in);
		int x;
		int y;

		while(true) {
			x = input.nextInt();
			y = input.nextInt();

			if(board[x][y] == ' ') {
				board[x][y] = marker;
				break;
			}
			else {
				// write out invalid input
				// try again
			}
		}

		Coordinates coords = new Coordinates(x, y);

		return coords;
	}
}