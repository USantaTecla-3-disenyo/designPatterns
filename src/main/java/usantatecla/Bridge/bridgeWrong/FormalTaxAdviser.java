package usantatecla.Bridge.bridgeWrong;

public class FormalTaxAdviser extends CasualAdviser {

	public FormalTaxAdviser() {
		super();
		printer.printMessageLevel1("Creating formalTaxAdviser");
	}

	@Override
	public void advise() {
		printer.printMessageLevel1("Performing formal tax advise (formalTaxAdviser)");
		TaxMinistry taxMinistry = new TaxMinistry();
		taxMinistry.getData();
	}

}
