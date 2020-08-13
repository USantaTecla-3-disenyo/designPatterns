package usantatecla.Facade.facadeWrong;

import usantatecla.Utils.utils.Printer;

public class Painter {

	private Printer printer = Printer.getInstance();

	public Painter() {
		printer.printMessageLevel3("Creating painter");
	}

	public void removeOldPaint() {
		printer.printMessageLevel3("Removing old paint (painter)");
	}

	public void applyPaint() {
		printer.printMessageLevel3("Apply paint (painter)");
	}
}
