package usantatecla.Adapter.adapterFine;
import usantatecla.Utils.utils.Printer;

public class AdapterPowerPlugF extends PowerPlugF {

	public AdapterPowerPlugF() {
		super();
		printer.printMessageLevel1("Creating adapter with a new powerPlugF");
	}

	public void setPowerPlugC(PowerPlugC powerPlugC) {
		printer.printMessageLevel1("Setting the powerPlugC for the adapter");
	}

	public void plug(PowerPointF powerPointF) {
		printer.printMessageLevel1("Plugging powerPlugF in powerPointF using adapter (inheritance)");
		super.plug(powerPointF);
	}
}
