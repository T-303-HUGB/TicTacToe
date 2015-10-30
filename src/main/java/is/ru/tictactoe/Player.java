package is.ru.tictactoe;

public class Player {
	protected int numberOfWins;
	protected String name;

	public Player() {
		
	}

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