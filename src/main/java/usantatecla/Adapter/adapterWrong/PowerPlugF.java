package usantatecla.Adapter.adapterWrong;

import usantatecla.Utils.utils.Printer;

public class PowerPlugF {

	private Printer printer = Printer.getInstance();

	public void plug(PowerPointF powerPointF) {
		printer.printMessageLevel2("Plugging powerPlugF in powerPointF");
	}
}
