package usantatecla.Decorator.decoratorFine;

import java.util.concurrent.TimeUnit;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("DECORATOR FINE");

		PastryChef apprenticePastryChef = new ApprenticePastryChef();
		MasterPastryChef masterPastryChef = new MasterPastryChef();

		printer.printSubTitle("MASTER PASTRY CHEF ORDERING THE APPRENTICE TO PREPARE TRADICIONAL COOKIES");

		PastryChef apprenticeTraditionalPastryChef = new TraditionalSkilledPastryChef(apprenticePastryChef);
		masterPastryChef.preparePastries(apprenticeTraditionalPastryChef);

		printer.printSubTitle("MASTER PASTRY CHEF ORDERING THE APPRENTICE TO PREPARE A SOUFFLE");

		PastryChef apprenticeFrenchCuisinelPastryChef = new FrenchCuisineSkilledPastryChef(apprenticePastryChef);
		masterPastryChef.preparePastries(apprenticeFrenchCuisinelPastryChef);

		rest();

		printer.printSubTitle(
				"MASTER PASTRY CHEF ORDERING THE APPRENTICE TO PREPARE BOTH TRADITIONAL COOKIES AND A SOUFFLE");

		PastryChef apprenticeMultiPurposePastryChef = new FrenchCuisineSkilledPastryChef(
				new TraditionalSkilledPastryChef(apprenticePastryChef));
		masterPastryChef.preparePastries(apprenticeMultiPurposePastryChef);
	}

	private static void rest() {
		try {
			TimeUnit.MINUTES.sleep(4);
		} catch (InterruptedException e) {
		}
	}
}