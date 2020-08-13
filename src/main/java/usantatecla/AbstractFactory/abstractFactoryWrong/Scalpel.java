package usantatecla.AbstractFactory.abstractFactoryWrong;

import usantatecla.Utils.utils.Printer;

public class Scalpel extends CuttingTool {

	@Override
	public void cut() {
		Printer.getInstance().printMessageLevel2("Performing a cut with scalpel");
	}
}