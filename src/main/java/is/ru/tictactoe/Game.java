package is.ru.tictactoe;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		int type;
		String s1, s2;
	
		System.out.println("Input type of game:");
		System.out.println("1: Player against player");
		System.out.println("2: Player again Computer");
		while(true) {
			type = Integer.parseInt(input.nextLine());

			if(type == 1) {
				System.out.println("Name of player 1: ");
				s1 = input.nextLine();
				System.out.println("Name of player 2: ");
				s2 = input.nextLine();
				game = new TicTacToe(s1, s2);
				break;
			}
			else if(type == 2) {
				System.out.println("Name of player: ");
				s1 = input.nextLine();
				game = new TicTacToe(s1);
				break;
			}
			else {
				System.out.print("Invalid game choice, choose again: ");
			}
		}

		while(true) {
			game.printBoard();
			Player player = game.getCurrentPlayer();
			System.out.println(game.WhoseTurnIsIt() + " It's your turn ");
			Coordinates coords = player.getMove(game.getBoard());
			game.playersTurn(coords);
		}
		
	}
}