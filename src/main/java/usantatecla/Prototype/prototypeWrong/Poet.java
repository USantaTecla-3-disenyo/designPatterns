package usantatecla.Prototype.prototypeWrong;

import usantatecla.Utils.utils.Printer;

public class Poet {

	private Printer printer = Printer.getInstance();

	public Poem sell(String title) {
		printer.printMessageLevel1("Selling a copy of the poem " + title + " (poet)");
		Poem poem = null;
		if (title == "La Casada Infiel")
			poem = this.createLaCasadaInfiel();
		else if (title == "Poema XX")
			poem = this.createPoemaXX();
		return poem;
	}

	private Poem createLaCasadaInfiel() {
		return new LaCasadaInfiel();
	}

	private Poem createPoemaXX() {
		return new PoemaXX();
	}
}