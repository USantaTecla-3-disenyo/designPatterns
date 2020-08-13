package usantatecla.Prototype.prototypeFineWithRegistry;

import usantatecla.Utils.utils.Printer;

public class Poet {

	private Printer printer = Printer.getInstance();

	public Poem sell(Poetry poetry, String title) {
		Poem poem = poetry.getPoem(title);
		printer.printMessageLevel1("Selling a copy of the poem " + title + " (poet)");
		return poem.copy();
	}
}