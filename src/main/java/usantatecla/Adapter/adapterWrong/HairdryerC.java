package usantatecla.Adapter.adapterWrong;

public class HairdryerC extends ApplianceC {

	public HairdryerC() {
		super();
		printer.printMessageLevel2("Created hairdryerC with its powerPlugC");
	}

	@Override
	protected void plug(PowerPointC powerPointC) {
		printer.printMessageLevel1("Plugging hairdryerC to powerPointC");
		super.plug(powerPointC);
	}
}
