package usantatecla.Bridge.bridgeFine;

public class TaxAnalyst extends Analyst {

	public TaxAnalyst() {
		super();
		printer.printMessageLevel1("Creating taxAnalyst");
	}

	@Override
	public void analyze() {
		printer.printMessageLevel1("Performing tax analysis (taxAnalyst)");
		TaxMinistry taxMinistry = new TaxMinistry();
		taxMinistry.getData();
	}

}
