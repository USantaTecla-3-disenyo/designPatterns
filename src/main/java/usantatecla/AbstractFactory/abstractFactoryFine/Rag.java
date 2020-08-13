package usantatecla.AbstractFactory.abstractFactoryFine;

import usantatecla.Utils.utils.Printer;

public class Rag extends DryingTool {

	private Printer printer = Printer.getInstance();

	@Override
	public void dry() {
		printer.printMessageLevel2("Drying with rag");
	}
}
