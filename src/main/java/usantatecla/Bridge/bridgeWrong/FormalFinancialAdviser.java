package usantatecla.Bridge.bridgeWrong;

public class FormalFinancialAdviser extends FormalAdviser {

	public FormalFinancialAdviser() {
		super();
		printer.printMessageLevel1("Creating formalFinancialAdviser");
	}

	@Override
	public void advise() {
		printer.printMessageLevel1("Performing formal financial advise (formalFinancialAdviser)");
		EconomyMinistry economyMinistry = new EconomyMinistry();
		economyMinistry.getData();
	}

}
