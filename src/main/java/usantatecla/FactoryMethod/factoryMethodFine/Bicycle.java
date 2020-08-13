package usantatecla.FactoryMethod.factoryMethodFine;

import usantatecla.Utils.utils.Printer;

public class Bicycle extends Vehicle {

	private Printer printer = Printer.getInstance();

	@Override
	public void ride() {
		printer.printMessageLevel2("Riding a bicycle");
	}
}
