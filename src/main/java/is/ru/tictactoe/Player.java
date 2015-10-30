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
		return null;
	}
}