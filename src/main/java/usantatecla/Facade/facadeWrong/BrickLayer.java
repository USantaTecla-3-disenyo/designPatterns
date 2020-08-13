package usantatecla.Facade.facadeWrong;

import usantatecla.Utils.utils.Printer;

public class BrickLayer {

	private Printer printer = Printer.getInstance();

	public BrickLayer() {
		printer.printMessageLevel3("Creating brickLayer");
	}

	public void takeDownWall() {
		printer.printMessageLevel3("Taking down a wall (brickLayer)");
	}

	public void buildWall() {
		printer.printMessageLevel3("Building a wall (brickLayer)");
	}
}
