package usantatecla.Bridge.bridgeFine;

import usantatecla.Utils.utils.Printer;

public class Analyst {

	protected Printer printer = Printer.getInstance();

	public void analyze() {
		printer.printMessageLevel1("Analysing (analyst)");
	}

}
