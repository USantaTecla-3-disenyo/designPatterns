package usantatecla.Builder.builderFine;

import usantatecla.Utils.utils.Printer;

public class BasicChef implements Chef {

	private Printer printer = Printer.getInstance();

	
	public Dish prepareStarter() {
		printer.printMessageLevel1("Preparing salad (basicChef)");
		return new Salad();
	}

	
	public Dish prepareMainCourse() {
		printer.printMessageLevel1("Preparing chicken (basicChef)");
		return new Chicken();
	}

	
	public Dish prepareDessert() {
		printer.printMessageLevel1("Preparing custard (basicChef)");
		return new Custard();
	}
}
