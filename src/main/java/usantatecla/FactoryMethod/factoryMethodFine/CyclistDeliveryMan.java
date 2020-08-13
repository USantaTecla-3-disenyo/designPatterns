package usantatecla.FactoryMethod.factoryMethodFine;

import usantatecla.Utils.utils.Printer;

public class CyclistDeliveryMan extends DeliveryMan {

	private Printer printer = Printer.getInstance();

	@Override
	public Bicycle getVehicle() {
		printer.printMessageLevel1("Getting a bicycle to deliver (cyclist deliveryman)");
		return new Bicycle();
	}
}
