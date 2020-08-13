package usantatecla.Bridge.bridgeWrong;

public class CasualFinancialAdviser extends CasualAdviser {

	public CasualFinancialAdviser() {
		super();
		printer.printMessageLevel1("Creating casualFinancialAdviser");
	}

	@Override
	public void advise() {
		printer.printMessageLevel1("Performing casual financial advise (casualFinancialAdviser)");
		EconomyMinistry economyMinistry = new EconomyMinistry();
		economyMinistry.getData();
	}

}
