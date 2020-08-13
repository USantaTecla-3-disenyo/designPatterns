package usantatecla.Decorator.decoratorFine;

public class TraditionalSkilledPastryChef extends SkilledPastryChef {

	protected TraditionalSkilledPastryChef(PastryChef pastryChef) {
		super(pastryChef);
		printer.printMessageLevel1("Creating traditionalSkilledPastryChef \n");
	}

	@Override
	public void beat() {
		super.beat();
		this.addBehaviourToBeatTraditionalCookies();
	}

	@Override
	public void bake() {
		super.bake();
		this.addStateToBakeTraditionalCookies();
	}

	private void addBehaviourToBeatTraditionalCookies() {
		printer.printMessageLevel2("Adding behabiour when beating eggs (traditionalSkilledPastryChef)");
		printer.printMessageLevel3("Beating eggs with chocolate chips for traditional cookies");
	}

	private void addStateToBakeTraditionalCookies() {
		printer.printMessageLevel2("Adding state when baking (traditionalSkilledPastryChef)");
		Clock clock = new Clock();

		if (!Oven.getInstance().isReady()) {
			printer.printMessageLevel3("Waiting for the oven to be ready for baking (traditionalSkilledPastryChef)");
			clock.setAlarmDelay(OVEN_DELAY);
		}
		printer.printMessageLevel3("Baking traditional cookies");

		printer.printMessageLevel3("Setting state in oven");
		Oven.getInstance().setLastTimeUsage(clock.getCurrentDate());
	}
}
