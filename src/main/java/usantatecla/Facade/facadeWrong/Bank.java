package usantatecla.Facade.facadeWrong;

import usantatecla.Utils.utils.Printer;

public class Bank {

	private Printer printer = Printer.getInstance();

	public void arrangeLoan() {
		printer.printMessageLevel2("Arranging loan (bank)");
	}
}
