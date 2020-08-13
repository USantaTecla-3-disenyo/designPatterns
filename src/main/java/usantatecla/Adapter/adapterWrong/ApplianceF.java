package usantatecla.Adapter.adapterWrong;

import usantatecla.Utils.utils.Printer;

public abstract class ApplianceF {

	protected Printer printer = Printer.getInstance();

	protected PowerPlugF powerPlugF;

	public ApplianceF() {
		printer.printMessageLevel1("Creating applianceF");
		this.powerPlugF = new PowerPlugF();
	}

	protected void plug(PowerPointF powerPointF) {
		this.powerPlugF.plug(powerPointF);
	}
}
