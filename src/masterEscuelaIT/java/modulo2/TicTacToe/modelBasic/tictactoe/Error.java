package src.masterEscuelaIT.java.modulo2.TicTacToe.modelBasic.tictactoe;


import src.masterEscuelaIT.java.modulo2.TicTacToe.modelBasic.utils.Console;

public enum Error {

	NOT_EMPTY("The square is not empty"),
	NOT_OWNER("There is not a token of yours"),
	SAME_COORDINATES("The origin and target squares are the same"),
	WRONG_COORDINATES("The coordinates are wrong"),
	NULL;

	private String message;

	Error(){
	}

	Error(String message){
		this.message = message;
	}

	public void writeln() {
		if (!this.isNull()) {
			Console.getInstance().writeln(this.message);
		}
	}

	public boolean isNull() {
		return this == Error.NULL;
	}

}
