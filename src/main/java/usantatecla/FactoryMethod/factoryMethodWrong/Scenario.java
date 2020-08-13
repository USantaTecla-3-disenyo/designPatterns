package usantatecla.FactoryMethod.factoryMethodWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("FACTORY METHOD WRONG");

		DeliveryMan deliveryMan = new DeliveryMan();

		printer.printSubTitle("DELIVERYMAN WITH FIRST VEHICLE");
		deliveryMan.deliver();

		printer.printSubTitle("DELIVERYMAN WITH SECOND VEHICLE");
		deliveryMan.deliver();
	}
}
