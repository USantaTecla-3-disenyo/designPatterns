package usantatecla.Adapter.adapterWrong;

public class HairdryerF extends ApplianceF {

	public HairdryerF() {
		super();
		printer.printMessageLevel2("Created hairdryerF with its powerPlugF");
	}

	@Override
	protected void plug(PowerPointF powerPointF) {
		printer.printMessageLevel1("Plugging hairdryerF to powerPointF");
		super.plug(powerPointF);
	}
}
