package is.ru.tictactoe;

public class TicTacToe {

	public static char[][] setBoard() {
		char board[][]={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		return board;
	}


	private static int toInt(String number){
		return Integer.parseInt(number);
	}
}