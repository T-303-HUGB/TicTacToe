package is.ru.tictactoe;

public class Coordinates {
	private int x;
	private int y;

	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int x() {
		return x;
	}

	public int y() {
		return y;
	}

	public boolean equals(Coordinates coord) {
		return x == coord.x() && y == coord.y();
	}
}