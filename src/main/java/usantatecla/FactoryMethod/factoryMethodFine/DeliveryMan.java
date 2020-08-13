package usantatecla.FactoryMethod.factoryMethodFine;

import usantatecla.Utils.utils.Printer;

public abstract class DeliveryMan {

	private Printer printer = Printer.getInstance();

	public abstract Vehicle getVehicle();

	public void deliver() {
		printer.printMessageLevel1("Delivering (deliveryman)");
		Vehicle vehicle = this.getVehicle();
		vehicle.ride();
	}
}