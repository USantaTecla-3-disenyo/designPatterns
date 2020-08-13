package usantatecla.Facade.facadeFine;

import usantatecla.Utils.utils.Printer;

public class Plumber {

	private Printer printer = Printer.getInstance();

	public Plumber() {
		printer.printMessageLevel4("Creating plumber");
	}

	public void installPipes() {
		printer.printMessageLevel4("Installing pipes (plumber)");
	}

	public void installFixtures() {
		printer.printMessageLevel4("Installing fixtures (plumber)");
	}
}
