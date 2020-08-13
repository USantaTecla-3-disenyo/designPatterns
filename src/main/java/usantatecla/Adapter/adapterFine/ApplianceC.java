package usantatecla.Adapter.adapterFine;

import usantatecla.Utils.utils.Printer;

public abstract class ApplianceC {

	protected Printer printer = Printer.getInstance();

	protected PowerPlugC powerPlugC;

	public PowerPlugC getPowerPlugC() {
		return powerPlugC;
	}

	public ApplianceC() {
		printer.printMessageLevel1("Creating applianceC");
		this.powerPlugC = new PowerPlugC();
	}

	protected void plug(PowerPointC powerPointC) {
		this.powerPlugC.plug(powerPointC);
	}
}
