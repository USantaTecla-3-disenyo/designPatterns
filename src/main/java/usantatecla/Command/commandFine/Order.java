package usantatecla.Command.commandFine;

import java.util.Random;

import usantatecla.Utils.utils.Printer;

public abstract class Order {

	protected Printer printer = Printer.getInstance();

	protected int generateRandom(int max) {
		return new Random().nextInt(max);
	}

	public abstract void serve();
}
