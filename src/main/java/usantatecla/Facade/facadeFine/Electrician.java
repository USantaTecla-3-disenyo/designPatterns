package usantatecla.Facade.facadeFine;

import usantatecla.Utils.utils.Printer;

public class Electrician {

	private Printer printer = Printer.getInstance();

	public Electrician() {
		printer.printMessageLevel4("Creating electrician");
	}

	public void installWiring() {
		printer.printMessageLevel4("Installing wiring (electrician)");
	}

	public void installLightingSystem() {
		printer.printMessageLevel4("Installing lighting system (electrician)");
	}
}
