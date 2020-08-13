package usantatecla.Adapter.adapterWrong;

import usantatecla.Utils.utils.Printer;

public class PowerPlugC {

	private Printer printer = Printer.getInstance();

	public void plug(PowerPointC powerPointC) {
		printer.printMessageLevel2("Plugging powerPlugC in powerPointC");
	}
}
