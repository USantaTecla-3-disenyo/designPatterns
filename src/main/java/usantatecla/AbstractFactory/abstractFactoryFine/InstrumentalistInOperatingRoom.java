package usantatecla.AbstractFactory.abstractFactoryFine;

import usantatecla.Utils.utils.Printer;

public class InstrumentalistInOperatingRoom implements Intrumentalist {

	private Printer printer = Printer.getInstance();


	public Scalpel createCuttingTool() {
		printer.printMessageLevel1("Creating cuttingTool scalpel (instrumentalist in operating room)");
		return new Scalpel();
	}


	public Compress createDryingTool() {
		printer.printMessageLevel1("Creating dryingTool compress (instrumentalist in operating room)");
		return new Compress();
	}
}