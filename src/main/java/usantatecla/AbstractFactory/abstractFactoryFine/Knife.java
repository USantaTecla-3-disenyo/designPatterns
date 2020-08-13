package usantatecla.AbstractFactory.abstractFactoryFine;

import usantatecla.Utils.utils.Printer;

public class Knife extends CuttingTool {

	private Printer printer = Printer.getInstance();

	@Override
	public void cut() {
		printer.printMessageLevel2("Performing a cut with knife");
	}
}
