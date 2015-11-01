package is.ru.tictactoe;

import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer(String name, char marker) {
		super(name, marker);
	}

	// Get input from player, validation for invalid input.
	public Coordinates getMove(char[][] board) {
		Scanner input = new Scanner(System.in);
		int x;
		int y;

		while(true) {
			System.out.print("Pick a row: ");
			x = input.nextInt();
			System.out.print("Pick a column: ");
			y = input.nextInt();
			x--;
			y--;

			if(x < 0 || x > 2 || y < 0 || y > 2) {
				System.out.println("Invalid input, try again");
			}
			else if(board[x][y] == ' ') {
				board[x][y] = marker;
				break;
			}
			else if(board[x][y] != ' ') {
				System.out.println("Location is already taken, try again");
				//try again
			}
		}

		Coordinates coords = new Coordinates(x, y);

		return coords;
	}
}