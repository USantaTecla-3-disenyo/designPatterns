package usantatecla.Composite.compositeFine;

import usantatecla.Utils.utils.Printer;

public class Game {

	private Printer printer = Printer.getInstance();

	public Game() {
		printer.printMessageLevel1("Creating game");
	};

	public void play(Player player1, Player player2) {
		printer.printMessageLevel1("Playing round \n");
		printer.printMessageLevel1("Playing player1: " + player1.getName());
		String answerFromPlayer1 = player1.play();
		printer.printMessageLevel2(answerFromPlayer1);
		printer.printMessageLevel1("Playing player2: " + player2.getName());
		String answerFromPlayer2 = player2.play();
		printer.printMessageLevel2(answerFromPlayer2);
	}
}
