package usantatecla.Facade.facadeFine;

import usantatecla.Utils.utils.Printer;

public class Carpenter {

	private Printer printer = Printer.getInstance();

	public Carpenter() {
		printer.printMessageLevel4("Creating carpenter");
	}

	public void installWindow() {
		printer.printMessageLevel4("Installing a window (carpenter)");
	}

	public void installMolding() {
		printer.printMessageLevel4("Installing molding (carpenter)");
	}
}
