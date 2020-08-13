package usantatecla.Decorator.decoratorWrong;

import usantatecla.Utils.utils.Printer;

public class ApprenticePastryChef {

	private Printer printer = Printer.getInstance();

	public ApprenticePastryChef() {
		printer.printMessageLevel1("Creating apprenticePastryChef");
	}

	public void beat() {
		printer.printMessageLevel1("Beating eggs (apprenticePastryChef)");
	}

	public void bake() {
		printer.printMessageLevel1("Baking (apprenticePastryChef)");
	}
}
