package usantatecla.Adapter.adapterFine;

import usantatecla.Utils.utils.Printer;

public class PowerPlugF {

	protected Printer printer = Printer.getInstance();

	public void plug(PowerPointF powerPointF) {
		printer.printMessageLevel2("Plugging powerPlugF in powerPointF");
	}
}
