package usantatecla.Adapter.adapterFine;

public class ShaverC extends ApplianceC {

	public ShaverC() {
		super();
		printer.printMessageLevel2("Created shaverC with its powerPlugC");
	}

	@Override
	public PowerPlugC getPowerPlugC() {
		printer.printMessageLevel1("Getting powerPlugC from shaverC");
		return super.getPowerPlugC();
	}

	@Override
	protected void plug(PowerPointC powerPointC) {
		printer.printMessageLevel1("Plugging shaverC to powerPointC");
		super.plug(powerPointC);
	}
}
