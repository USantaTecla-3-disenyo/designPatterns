package usantatecla.Decorator.decoratorFine;

public class SkilledPastryChef extends PastryChef {

	protected static final int OVEN_DELAY = 1;

	private PastryChef next;

	protected SkilledPastryChef(PastryChef pastryChef) {
		this.next = pastryChef;
	}

	@Override
	public void beat() {
		printer.printMessageLevel1("Showing how to beat eggs to the apprentice (skilledPastryChef)");
		next.beat();
	}

	@Override
	public void bake() {
		printer.printMessageLevel1("Showing how to bake to the apprentice (skilledPastryChef)");
		next.bake();
	}
}
