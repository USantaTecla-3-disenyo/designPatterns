package usantatecla.AbstractFactory.abstractFactoryWrong;

import usantatecla.Utils.utils.Printer;

public class Knife extends CuttingTool {

	@Override
	public void cut() {
		Printer.getInstance().printMessageLevel2("Performing a cut with knife");
	}
}
