package usantatecla.Facade.facadeFine;

import usantatecla.Utils.utils.Printer;

public class TownHall {

	private Printer printer = Printer.getInstance();

	public void arrangeLicense() {
		printer.printMessageLevel2("Arranging license (townHall)");
	}
}
