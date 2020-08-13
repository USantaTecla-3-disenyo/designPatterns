package usantatecla.AbstractFactory.abstractFactoryFine;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("ABSTRACT FACTORY FINE");

		Surgeon surgeon = new Surgeon();

		printer.printSubTitle("SURGEON IN OPERATING ROOM");
		InstrumentalistInOperatingRoom instrumentalistInOperatingRoom = new InstrumentalistInOperatingRoom();
		surgeon.operate(instrumentalistInOperatingRoom);

		printer.printSubTitle("SURGEON IN JUNGLE");
		InstrumentalistInJungle instrumentalistInJungle = new InstrumentalistInJungle();
		surgeon.operate(instrumentalistInJungle);
	}
}
