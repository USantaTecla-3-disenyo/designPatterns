package usantatecla.Strategy.strategyFine;

import usantatecla.Utils.utils.Printer;

public class Person {

	private Printer printer = Printer.getInstance();

	private Approach approach;
	
	public void setApproach(Approach approach) {
		this.approach = approach;
	}

	public void flirt() {
		printer.printMessageLevel2("\nTrying to flirt (person)");
		this.approach.approach();
		printer.printMessageLevel2("Inviting to dinner (person)");
	}
	
	public void makeFriendship() {
		printer.printMessageLevel2("\nTrying to make friendship (person)");
		this.approach.approach();
		printer.printMessageLevel2("Inviting to match (person)");
	}
}
