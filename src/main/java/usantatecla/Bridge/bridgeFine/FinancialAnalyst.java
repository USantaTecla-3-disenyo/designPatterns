package usantatecla.Bridge.bridgeFine;

public class FinancialAnalyst extends Analyst {

	public FinancialAnalyst() {
		super();
		printer.printMessageLevel1("Creating financialAnalyst");
	}

	@Override
	public void analyze() {
		printer.printMessageLevel1("Performing financial analysis (financialAnalyst)");
		EconomyMinistry economyMinistry = new EconomyMinistry();
		economyMinistry.getData();
	}

}
