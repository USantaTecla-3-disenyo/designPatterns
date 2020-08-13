package usantatecla.AbstractFactory.abstractFactoryFine;

import usantatecla.Utils.utils.Printer;

public class InstrumentalistInJungle implements Intrumentalist {

	private Printer printer = Printer.getInstance();

	public Knife createCuttingTool() {
		printer.printMessageLevel1("Creating cuttingTool knife (instrumentalist in jungle)");
		return new Knife();
	}

	public Rag createDryingTool() {
		printer.printMessageLevel1("Creating dryingTool rag (instrumentalist in jungle)");
		return new Rag();
	}
}
