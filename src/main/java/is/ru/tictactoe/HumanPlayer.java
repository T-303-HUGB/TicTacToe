package is.ru.tictactoe;

public class HumanPlayer extends Player {

	public Coordinates getMove() {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();

		Coordinates coords = new Coordinates(x, y);

		return coords;
	}
}