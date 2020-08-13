package usantatecla.AbstractFactory.abstractFactoryWrong;

import usantatecla.Utils.utils.Printer;

public class Compress extends DryingTool {

	@Override
	public void dry() {
		Printer.getInstance().printMessageLevel2("Drying with compress");
	}
}