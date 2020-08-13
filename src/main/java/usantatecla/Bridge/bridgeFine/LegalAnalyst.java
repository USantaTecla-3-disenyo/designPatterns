package usantatecla.Bridge.bridgeFine;

public class LegalAnalyst extends Analyst {

	public LegalAnalyst() {
		super();
		printer.printMessageLevel1("Creating legalAnalyst");
	}

	@Override
	public void analyze() {
		printer.printMessageLevel1("Performing legal analysis (legalAnalyst)");
		LawMinistry lawMinistry = new LawMinistry();
		lawMinistry.getData();
	}

}
