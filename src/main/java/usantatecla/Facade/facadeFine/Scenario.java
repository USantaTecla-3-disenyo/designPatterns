package usantatecla.Facade.facadeFine;

import java.util.Calendar;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("FACADE FINE");

		printer.printSubTitle("OWNER PERFORMING ALTERATIONS AT HOME");

		Bank bank = new Bank();
		TownHall townHall = new TownHall();
		Owner owner = new Owner(bank, townHall);

		Contractor contractor = new Contractor();

		owner.performAlteration(contractor);
	}
}