package usantatecla.Bridge.bridgeFine;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("BRIDGE FINE");

		Adviser casualAdviser = new CasualAdviser();
		Adviser formalAdviser = new FormalAdviser();

		Analyst financialAnalyst = new FinancialAnalyst();
		Analyst legalAnalyst = new LegalAnalyst();
		Analyst taxAnalyst = new TaxAnalyst();

		printer.printSubTitle("CASUAL FINANCIAL ADVISER");
		casualAdviser.setAnalyst(financialAnalyst);
		casualAdviser.advise();

		printer.printSubTitle("FORMAL FINANCIAL ADVISER");
		formalAdviser.setAnalyst(financialAnalyst);
		formalAdviser.advise();

		printer.printSubTitle("CASUAL LEGAL ADVISER");
		casualAdviser.setAnalyst(legalAnalyst);
		casualAdviser.advise();

		printer.printSubTitle("FORMAL LEGAL ADVISER");
		formalAdviser.setAnalyst(legalAnalyst);
		formalAdviser.advise();

		printer.printSubTitle("CASUAL TAX ADVISER");
		casualAdviser.setAnalyst(taxAnalyst);
		casualAdviser.advise();

		printer.printSubTitle("FORMAL TAX ADVISER");
		formalAdviser.setAnalyst(taxAnalyst);
		formalAdviser.advise();
	}
}