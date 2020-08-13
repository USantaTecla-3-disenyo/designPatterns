package usantatecla.Bridge.bridgeWrong;

import usantatecla.Utils.utils.Printer;

public class Adviser {

	protected Printer printer = Printer.getInstance();

	public void advise() {
		printer.printMessageLevel1("Advising");
	}
}
