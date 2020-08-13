package usantatecla.FactoryMethod.factoryMethodWrong;

import java.util.Random;

import usantatecla.Utils.utils.Printer;

public class DeliveryMan {

	private Printer printer = Printer.getInstance();

	enum AvailableVehicle {
		BICYCLE, MOTORCYCLE
	};

	private int generateRandomVehicle() {
		Random randomVehicle = new Random();
		return randomVehicle.nextInt(AvailableVehicle.values().length);
	}

	public void deliver() {
		printer.printMessageLevel1("Delivering (deliveryman)");

		int deliverymanVehicle = this.generateRandomVehicle();
		Vehicle vehicle = null;

		if (deliverymanVehicle == AvailableVehicle.BICYCLE.ordinal()) {
			printer.printMessageLevel1("Getting a bicycle to deliver (cyclist deliveryman)");
			vehicle = this.getBicycle();
		} else if (deliverymanVehicle == AvailableVehicle.MOTORCYCLE.ordinal()) {
			printer.printMessageLevel1("Getting a motorcycle to deliver (motorcyclist deliveryman)");
			vehicle = this.getMotorcycle();
		}

		vehicle.ride();
	}

	private Bicycle getBicycle() {
		return new Bicycle();
	}

	private Motorcycle getMotorcycle() {
		return new Motorcycle();
	}
}