package usantatecla.Facade.facadeFine;

import usantatecla.Utils.utils.Printer;

public class Owner {

	private Printer printer = Printer.getInstance();

	private Bank bank;
	private TownHall townHall;

	public Owner(Bank bank, TownHall townHall) {
		printer.printMessageLevel1("Creating owner with its associated bank and townHall");
		this.bank = bank;
		this.townHall = townHall;
	}

	public void performAlteration(Contractor contractor) {
		printer.printMessageLevel1("Performing alteration (owner)");
		this.bank.arrangeLoan();
		this.townHall.arrangeLicense();
		contractor.performAlteration();
	}
}
