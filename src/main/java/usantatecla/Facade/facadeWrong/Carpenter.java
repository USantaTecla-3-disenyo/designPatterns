package usantatecla.Facade.facadeWrong;

import usantatecla.Utils.utils.Printer;

public class Carpenter {

	private Printer printer = Printer.getInstance();

	public Carpenter() {
		printer.printMessageLevel3("Creating carpenter");
	}

	public void installWindow() {
		printer.printMessageLevel3("Installing a window (carpenter)");
	}

	public void installMolding() {
		printer.printMessageLevel3("Installing molding (carpenter)");
	}
}
