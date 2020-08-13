package usantatecla.Command.commandWrong;

import java.util.Random;

import usantatecla.Utils.utils.Printer;

public class Waiter {

	private Printer printer = Printer.getInstance();

	private Chef[] chefs;
	private Barman[] barmen;

	public Waiter(Chef[] chefs, Barman[] barmen) {
		this.chefs = chefs;
		this.barmen = barmen;
	}

	private int generateRandomEmployeeId() {
		Random randomEmployeeId = new Random();
		return randomEmployeeId.nextInt(Restaurant.MAX_NUMBER_EMPLOYEES_PER_TYPE);
	}

	public void serveDishOfTheDay() {
		printer.printMessageLevel1("Requesting a dishOfTheDay (waiter)");
		int chefId = this.generateRandomEmployeeId();
		this.chefs[chefId].prepareSoup();
		this.chefs[chefId].prepareSteak();
		this.chefs[chefId].prepareFries();
	}

	public void serveCombinationPlate() {
		printer.printMessageLevel1("Requesting a combinationPlate (waiter)");
		int chefId = this.generateRandomEmployeeId();
		this.chefs[chefId].prepareSalad();
		this.chefs[chefId].prepareEggs();
		this.chefs[chefId].prepareFries();
	}

	public void serveVermouth() {
		printer.printMessageLevel1("Requesting a vermouth (waiter)");
		this.barmen[this.generateRandomEmployeeId()].prepareVermouth();
	}

	public void serveBloodyMary() {
		printer.printMessageLevel1("Requesting a bloodyMary (waiter)");
		this.barmen[this.generateRandomEmployeeId()].prepareBloodyMary();
	}
}
