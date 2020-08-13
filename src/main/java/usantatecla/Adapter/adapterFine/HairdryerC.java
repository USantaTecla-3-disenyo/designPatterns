package usantatecla.Adapter.adapterFine;
import usantatecla.Utils.utils.Printer;

public class HairdryerC extends ApplianceC {

	public HairdryerC() {
		super();
		printer.printMessageLevel2("Created hairdryerC with its powerPlugC");
	}

	@Override
	public PowerPlugC getPowerPlugC() {
		printer.printMessageLevel1("Getting powerPlugC from hairdryerC");
		return super.getPowerPlugC();
	}

	@Override
	protected void plug(PowerPointC powerPointC) {
		printer.printMessageLevel1("Plugging hairdryerC to powerPointC");
		super.plug(powerPointC);
	}
}
