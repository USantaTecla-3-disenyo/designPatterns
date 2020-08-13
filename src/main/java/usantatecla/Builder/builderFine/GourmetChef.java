package usantatecla.Builder.builderFine;

import usantatecla.Utils.utils.Printer;

public class GourmetChef implements Chef {

	private Printer printer = Printer.getInstance();

	
	public Dish prepareStarter() {
		printer.printMessageLevel1("Preparing oyster (gourmetChef)");
		return new Oyster();
	}

	
	public Dish prepareMainCourse() {
		printer.printMessageLevel1("Preparing sirloin (gourmetChef)");
		return new Sirloin();
	}

	
	public Dish prepareDessert() {
		printer.printMessageLevel1("Preparing souffle (gourmetChef)");
		return new Souffle();
	}
}
