package usantatecla.AbstractFactory.abstractFactoryFine;

import usantatecla.Utils.utils.Printer;

public class Compress extends DryingTool {

	private Printer printer = Printer.getInstance();

	@Override
	public void dry() {
		printer.printMessageLevel2("Drying with compress");
	}
}