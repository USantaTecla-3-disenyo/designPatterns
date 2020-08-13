package usantatecla.Facade.facadeFine;

import usantatecla.Utils.utils.Printer;

public class Contractor {

	private Printer printer = Printer.getInstance();

	public void performAlteration() {
		printer.printMessageLevel2("Performing alteration (contractor)");

		printer.printMessageLevel3("Hiring crew (contractor)");
		BrickLayer brickLayer = new BrickLayer();
		Carpenter carpenter = new Carpenter();
		Electrician electrician = new Electrician();
		Plumber plumber = new Plumber();
		Painter painter = new Painter();

		printer.printMessageLevel3("Coordinating alteration (contractor)");
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
