package usantatecla.Facade.facadeWrong;

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

	public void performAlteration() {
		printer.printMessageLevel1("Performing alteration (owner)");
		this.bank.arrangeLoan();
		this.townHall.arrangeLicense();

		printer.printMessageLevel2("Hiring crew (owner)");
		BrickLayer brickLayer = new BrickLayer();
		Carpenter carpenter = new Carpenter();
		Electrician electrician = new Electrician();
		Plumber plumber = new Plumber();
		Painter painter = new Painter();

		printer.printMessageLevel2("Coordinating alteration (owner)");
		brickLayer.takeDownWall();
		brickLayer.buildWall();
		carpenter.installWindow();
		electrician.installWiring();
		plumber.installPipes();
		electrician.installLightingSystem();
		plumber.installFixtures();
		painter.removeOldPaint();
		carpenter.installMolding();
		painter.applyPaint();
	}
}
