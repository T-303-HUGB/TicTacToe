package is.ru.tictactoe;

import java.util.Scanner;

public class Game {

	// Return a game type user wants to play, whether user wants to compete 
	// agains a friend or against the computer
	private static TicTacToe gameType() {
		Scanner input = new Scanner(System.in);
		String s1, s2;
		int type;
		TicTacToe game = new TicTacToe();
		System.out.println("Input type of game:");
		System.out.println("1: Player against player");
		System.out.println("2: Player against Computer");
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
		return game;
	}

	// Game is played with each user taking turns until board is full
	// or a winner is found
	private static int playGame(TicTacToe game) {
		int win = 0;
		while(win == 0) {
			game.printBoard();
			System.out.println(game.WhoseTurnIsIt() + " it's your turn!");
			Player player = game.getCurrentPlayer();
			Coordinates coords = player.getMove(game.getBoard());
			game.playersTurn(coords);
			win = game.checkForWin();
		}
		return win;
	}

	// Prints out the game result
	private static void winner(int win, TicTacToe game, Player p1, Player p2) {
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
	}

	// Prints out the current win score of both players.
	private static void currentScore(TicTacToe game, Player p1, Player p2) {
		System.out.println("Current score:");
		System.out.println(game.getPlayer1().getName() + ": " + game.getPlayer1().getNumberOfWins());
		System.out.println(game.getPlayer2().getName() + ": " + game.getPlayer2().getNumberOfWins());
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		TicTacToe game = gameType();
		Player p1 = game.getPlayer1();
		Player p2 = game.getPlayer2();

		char again = 'y';
		while(again == 'y' || again == 'Y') {
			game.clearBoard();
			int win = playGame(game);
			game.printBoard();
			winner(win, game, p1,p2);
			currentScore(game, p1, p2);
			
			System.out.print("Want to play again (y/Y)? ");
			again = input.next(".").charAt(0);
		}
		
		
	}
}