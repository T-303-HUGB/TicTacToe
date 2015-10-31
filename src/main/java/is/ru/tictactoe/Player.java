package is.ru.tictactoe;

public class Player {
	protected int numberOfWins;
	protected String name;
	protected char marker;

	public Player() {
		
	}

	public Player(String name, char marker) {
		this.name = name;
		this.marker = marker;
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

	public Coordinates getMove(char[][] board) {
		return null;
	}
}