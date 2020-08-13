package usantatecla.Facade.facadeWrong;

import usantatecla.Utils.utils.Printer;

public class Plumber {

	private Printer printer = Printer.getInstance();

	public Plumber() {
		printer.printMessageLevel3("Creating plumber");
	}

	public void installPipes() {
		printer.printMessageLevel3("Installing pipes (plumber)");
	}

	public void installFixtures() {
		printer.printMessageLevel3("Installing fixtures (plumber)");
	}
}
