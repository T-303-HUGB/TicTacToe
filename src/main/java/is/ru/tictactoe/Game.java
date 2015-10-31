package is.ru.tictactoe;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1, s2;
		System.out.println("Name of player 1: ");
		s1 = input.nextLine();
		System.out.println("Name of player 2: ");
		s2 = input.nextLine();
		TicTacToe game = new TicTacToe(s1, s2);

		while(true) {
			game.printBoard();
			Player player = game.getCurrentPlayer();
			Coordinates coords = player.getMove(game.getBoard());
			game.playersTurn(coords);
		}
		
	}
}