package usantatecla.FactoryMethod.factoryMethodFine;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("FACTORY METHOD FINE");

		printer.printSubTitle("DELIVERYMAN WITH BICYCLE");
		CyclistDeliveryMan cyclistDeliveryMan = new CyclistDeliveryMan();
		cyclistDeliveryMan.deliver();

		printer.printSubTitle("DELIVERYMAN WITH MOTORCYCLE");
		MotorcyclistDeliveryMan motorcyclistDeliveryMan = new MotorcyclistDeliveryMan();
		motorcyclistDeliveryMan.deliver();
	}

}
