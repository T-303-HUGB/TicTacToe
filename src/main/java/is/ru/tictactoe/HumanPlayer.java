package is.ru.tictactoe;

import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer(String name) {
		super(name);
	}

	public Coordinates getMove() {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();

		Coordinates coords = new Coordinates(x, y);

		return coords;
	}
}