package usantatecla.Decorator.decoratorFine;

public class ApprenticePastryChef extends PastryChef {

	public ApprenticePastryChef() {
		super();
		printer.printMessageLevel1("Creating apprenticePastryChef");
	}

	@Override
	public void beat() {
		printer.printMessageLevel1("Beating eggs (apprenticePastryChef)");
	}

	@Override
	public void bake() {
		printer.printMessageLevel1("Baking (apprenticePastryChef)");
	}
}
