package usantatecla.Facade.facadeWrong;

import usantatecla.Utils.utils.Printer;

public class Electrician {

	private Printer printer = Printer.getInstance();

	public Electrician() {
		printer.printMessageLevel3("Creating electrician");
	}

	public void installWiring() {
		printer.printMessageLevel3("Installing wiring (electrician)");
	}

	public void installLightingSystem() {
		printer.printMessageLevel3("Installing lighting system (electrician)");
	}
}
