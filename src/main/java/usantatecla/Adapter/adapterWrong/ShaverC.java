package usantatecla.Adapter.adapterWrong;

public class ShaverC extends ApplianceC {

	public ShaverC() {
		super();
		printer.printMessageLevel2("Created shaverC with its powerPlugC");
	}

	@Override
	protected void plug(PowerPointC powerPointC) {
		printer.printMessageLevel1("Plugging shaverC to powerPointC");
		super.plug(powerPointC);
	}
}
