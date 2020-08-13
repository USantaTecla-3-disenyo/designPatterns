package usantatecla.Bridge.bridgeWrong;

public class CasualTaxAdviser extends CasualAdviser {

	public CasualTaxAdviser() {
		super();
		printer.printMessageLevel1("Creating casualTaxAdviser");
	}

	@Override
	public void advise() {
		printer.printMessageLevel1("Performing casual tax advise (casualTaxAdviser)");
		TaxMinistry taxMinistry = new TaxMinistry();
		taxMinistry.getData();
	}

}
