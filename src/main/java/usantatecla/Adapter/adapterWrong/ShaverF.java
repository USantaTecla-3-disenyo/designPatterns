package usantatecla.Adapter.adapterWrong;

public class ShaverF extends ApplianceF {

	public ShaverF() {
		super();
		printer.printMessageLevel2("Created shaverF with its powerPlugF");
	}

	@Override
	protected void plug(PowerPointF powerPointF) {
		printer.printMessageLevel1("Plugging shaverF to powerPointF");
		super.plug(powerPointF);
	}
}
