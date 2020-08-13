package usantatecla.Command.commandFine;

import usantatecla.Utils.utils.Printer;

public class Waiter {

	private Printer printer = Printer.getInstance();

	public void serve(Order order) {
		printer.printMessageLevel1("Requesting an order (waiter)");
		order.serve();
	}

}
