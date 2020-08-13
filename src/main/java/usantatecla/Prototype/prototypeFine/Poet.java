package usantatecla.Prototype.prototypeFine;

import usantatecla.Utils.utils.Printer;

public class Poet {

	private Printer printer = Printer.getInstance();

	public Poem sell(String title) {
		Poem requestedPoem = Poem.getPoem(title);
		printer.printMessageLevel1("Selling a copy of the poem " + title + " (poet)");
		return requestedPoem.copy();
	}
}