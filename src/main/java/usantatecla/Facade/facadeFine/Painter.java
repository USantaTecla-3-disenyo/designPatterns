package usantatecla.Facade.facadeFine;

import usantatecla.Utils.utils.Printer;

public class Painter {

	private Printer printer = Printer.getInstance();

	public Painter() {
		printer.printMessageLevel4("Creating painter");
	}

	public void removeOldPaint() {
		printer.printMessageLevel4("Removing old paint (painter)");
	}

	public void applyPaint() {
		printer.printMessageLevel4("Apply paint (painter)");
	}
}
