package usantatecla.Command.commandFine;

import usantatecla.Utils.utils.Printer;

public class Chef {

	private Printer printer = Printer.getInstance();

	private String name;

	public Chef(String name) {
		this.name = name;
	}

	public void prepareSalad() {
		printer.printMessageLevel3("Preparing salad (" + this.name + ")");
	}

	public void prepareEggs() {
		printer.printMessageLevel3("Preparing eggs (" + this.name + ")");
	}

	public void prepareFries() {
		printer.printMessageLevel3("Preparing fries (" + this.name + ")");
	}

	public void prepareSoup() {
		printer.printMessageLevel3("Preparing soup (" + this.name + ")");
	}

	public void prepareSteak() {
		printer.printMessageLevel3("Preparing steak (" + this.name + ")");
	}

	public void cleanKitchen() {
		printer.printMessageLevel1("Cleaning kitchen (" + this.name + ")");
	}
}
