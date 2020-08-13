package usantatecla.FactoryMethod.factoryMethodFine;

import usantatecla.Utils.utils.Printer;

public class MotorcyclistDeliveryMan extends DeliveryMan {

	private Printer printer = Printer.getInstance();

	@Override
	public Motorcycle getVehicle() {
		Printer.getInstance().printMessageLevel1("Getting a motorcycle to deliver (motorcyclist deliveryman)");
		return new Motorcycle();
	}
}