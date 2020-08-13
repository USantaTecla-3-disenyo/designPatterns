package usantatecla.Bridge.bridgeWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("BRIDGE FINE");

		Adviser casualFinancialAdviser = new CasualFinancialAdviser();
		Adviser casualLegalAdviser = new CasualLegalAdviser();
		Adviser casualTaxAdviser = new CasualTaxAdviser();
		Adviser formalFinancialAdviser = new FormalFinancialAdviser();
		Adviser formalLegalAdviser = new FormalLegalAdviser();
		Adviser formalTaxAdviser = new FormalTaxAdviser();

		printer.printSubTitle("CASUAL FINANCIAL ADVISER");
		casualFinancialAdviser.advise();

		printer.printSubTitle("FORMAL FINANCIAL ADVISER");
		formalFinancialAdviser.advise();

		printer.printSubTitle("CASUAL LEGAL ADVISER");
		casualLegalAdviser.advise();

		printer.printSubTitle("FORMAL LEGAL ADVISER");
		formalLegalAdviser.advise();

		printer.printSubTitle("CASUAL TAX ADVISER");
		casualTaxAdviser.advise();

		printer.printSubTitle("FORMAL TAX ADVISER");
		formalTaxAdviser.advise();
	}
}