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


		Player p1 = game.getPlayer1();
		Player p2 = game.getPlayer2();
		char again = 'y';
		while(again == 'y' || again == 'Y') {
			game.clearBoard();
			int win = 0;
			while(win == 0) {
				game.printBoard();
				System.out.println(game.WhoseTurnIsIt() + " it's your turn!");
				Player player = game.getCurrentPlayer();
				Coordinates coords = player.getMove(game.getBoard());
				game.playersTurn(coords);
				win = game.checkForWin();
			}

			game.printBoard();
			if(win == 1) {
				System.out.println(p1.getName() + " won");
				game.getPlayer1().playerWon();
			}
			else if(win == 2) {
				System.out.println(p2.getName() + " won");
				game.getPlayer2().playerWon();
			}
			else if(win == 3) {
				System.out.println("Game ends in a tie");
			}

			System.out.println("Current score:");
			System.out.println(p1.getName() + ": " + game.getPlayer1().getNumberOfWins());
			System.out.println(p2.getName() + ": " + game.getPlayer2().getNumberOfWins());

			System.out.print("Want to play again (y/Y)? ");
			again = input.next(".").charAt(0);
		}
		
		
	}
}