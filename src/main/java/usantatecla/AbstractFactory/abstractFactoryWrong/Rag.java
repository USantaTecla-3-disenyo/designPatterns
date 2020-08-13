package usantatecla.AbstractFactory.abstractFactoryWrong;

import usantatecla.Utils.utils.Printer;

public class Rag extends DryingTool {

	@Override
	public void dry() {
		Printer.getInstance().printMessageLevel2("Drying with rag");
	}
}