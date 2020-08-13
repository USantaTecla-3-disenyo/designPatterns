package usantatecla.AbstractFactory.abstractFactoryWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("ABSTRACT FACTORY WRONG");

		Surgeon surgeon = new Surgeon();

		printer.printSubTitle("SURGEON IN FIRST LOCATION");
		surgeon.operate();

		printer.printSubTitle("SURGEON IN SECOND LOCATION");
		surgeon.operate();
	}
}
