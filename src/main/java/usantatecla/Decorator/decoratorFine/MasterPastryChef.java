package usantatecla.Decorator.decoratorFine;

import usantatecla.Utils.utils.Printer;

public class MasterPastryChef {

	private Printer printer = Printer.getInstance();

	public MasterPastryChef() {
		printer.printMessageLevel1("Creating masterPastryChef");
	}

	public void preparePastries(PastryChef pastryChef) {
		printer.printMessageLevel1("MasterPastryChef requesting to prepare pastries \n");
		pastryChef.beat();
		pastryChef.bake();
	}
}
