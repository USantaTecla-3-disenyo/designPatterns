package usantatecla.Decorator.decoratorWrong;

import java.util.concurrent.TimeUnit;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("DECORATOR WRONG");

		MasterPastryChef masterPastryChef = new MasterPastryChef();
		ApprenticePastryChef apprenticePastryChef = new ApprenticePastryChef();

		printer.printSubTitle("MASTER PASTRY CHEF ORDERING THE APPRENTICE TO PREPARE TRADICIONAL COOKIES");

		masterPastryChef.prepareTraditionalCookies(apprenticePastryChef);

		printer.printSubTitle("MASTER PASTRY CHEF ORDERING THE APPRENTICE TO PREPARE A SOUFFLE");

		masterPastryChef.prepareSouffle(apprenticePastryChef);

		rest();

		printer.printSubTitle(
				"MASTER PASTRY CHEF ORDERING THE APPRENTICE TO PREPARE BOTH TRADITIONAL COOKIES AND A SOUFFLE");

		masterPastryChef.prepareTraditionalCookies(apprenticePastryChef);
		masterPastryChef.prepareSouffle(apprenticePastryChef);
	}

	private static void rest() {
		try {
			TimeUnit.MINUTES.sleep(4);
		} catch (InterruptedException e) {
		}
	}
}