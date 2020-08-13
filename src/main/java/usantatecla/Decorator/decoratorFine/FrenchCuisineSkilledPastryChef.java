package usantatecla.Decorator.decoratorFine;

public class FrenchCuisineSkilledPastryChef extends SkilledPastryChef {

	protected FrenchCuisineSkilledPastryChef(PastryChef pastryChef) {
		super(pastryChef);
		printer.printMessageLevel1("Creating frenchCuisineSkilledPastryChef \n");
	}

	@Override
	public void beat() {
		super.beat();
		this.addBehaviourToBeatSouffle();
	}

	@Override
	public void bake() {
		super.bake();
		this.addStateToBakeSouffle();
	}

	private void addBehaviourToBeatSouffle() {
		printer.printMessageLevel2("Adding behabiour when beating eggs (frenchCuisineSkilledPastryChef)");
		printer.printMessageLevel3("Beating eggs with vanilla extract for souffle");
	}

	private void addStateToBakeSouffle() {
		printer.printMessageLevel2("Adding state when baking (frenchCuisineSkilledPastryChef)");
		Clock clock = new Clock();

		if (!Oven.getInstance().isReady()) {
			printer.printMessageLevel3("Waiting for the oven to be ready for baking (frenchCuisineSkilledPastryChef)");
			clock.setAlarmDelay(OVEN_DELAY);
		}
		printer.printMessageLevel3("Baking souffle");

		printer.printMessageLevel3("Setting state in oven");
		Oven.getInstance().setLastTimeUsage(clock.getCurrentDate());
	}
}
