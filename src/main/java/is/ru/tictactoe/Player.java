package is.ru.tictactoe;

import java.util.Scanner;

public class Player {
	private int numberOfWins;
	private String name;

	public Player(String name) {
		this.name = name;
		numberOfWins = 0;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfWins() {
		return numberOfWins;
	}

	public void playerWon() {
		numberOfWins++;
	}

	public Coordinates getMove() {
		Scanner input = new Scanner(System.in);
		int x = 1;//input.nextInt();
		int y = 1;//input.nextInt();

		Coordinates coords = new Coordinates(x, y);

		return coords;
	}

}