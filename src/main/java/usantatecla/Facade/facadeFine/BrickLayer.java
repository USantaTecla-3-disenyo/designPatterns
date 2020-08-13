package usantatecla.Facade.facadeFine;

import usantatecla.Utils.utils.Printer;

public class BrickLayer {

	private Printer printer = Printer.getInstance();

	public BrickLayer() {
		printer.printMessageLevel4("Creating brickLayer");
	}

	public void takeDownWall() {
		printer.printMessageLevel4("Taking down a wall (brickLayer)");
	}

	public void buildWall() {
		printer.printMessageLevel4("Building a wall (brickLayer)");
	}
}
