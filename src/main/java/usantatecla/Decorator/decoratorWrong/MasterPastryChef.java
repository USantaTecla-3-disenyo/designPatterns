package usantatecla.Decorator.decoratorWrong;

import usantatecla.Decorator.decoratorFine.Clock;
import usantatecla.Decorator.decoratorFine.Oven;
import usantatecla.Utils.utils.Printer;

public class MasterPastryChef {

	private static final int OVEN_DELAY = 1;

	private Printer printer = Printer.getInstance();

	public MasterPastryChef() {
		printer.printMessageLevel1("Creating masterPastryChef");
	}

	public void prepareTraditionalCookies(ApprenticePastryChef apprenticePastryChef) {
		printer.printMessageLevel1("MasterPastryChef requesting to prepare traditional cookies \n");
		apprenticePastryChef.beat();
		this.addBehaviourToBeatTraditionalCookies();
		apprenticePastryChef.bake();
		this.addStateToBakeTraditionalCookies();
	}

	public void prepareSouffle(ApprenticePastryChef apprenticePastryChef) {
		printer.printMessageLevel1("MasterPastryChef requesting to prepare a souffle \n");
		apprenticePastryChef.beat();
		this.addBehaviourToBeatSouffle();
		apprenticePastryChef.bake();
		this.addStateToBakeSouffle();
	}

	private void addBehaviourToBeatTraditionalCookies() {
		printer.printMessageLevel1("Showing how to beat eggs to the apprentice (masterPastryChef)");
		printer.printMessageLevel2("Adding behabiour when beating eggs (masterPastryChef)");
		printer.printMessageLevel3("Beating eggs with chocolate chips for traditional cookies");
	}

	private void addStateToBakeTraditionalCookies() {
		printer.printMessageLevel2("Adding state when baking (masterPastryChef)");
		Clock clock = new Clock();

		if (!Oven.getInstance().isReady()) {
			printer.printMessageLevel3("Waiting for the oven to be ready for baking (masterPastryChef)");
			clock.setAlarmDelay(OVEN_DELAY);
		}
		printer.printMessageLevel3("Baking traditional cookies");

		printer.printMessageLevel3("Setting state in oven");
		Oven.getInstance().setLastTimeUsage(clock.getCurrentDate());
	}

	private void addBehaviourToBeatSouffle() {
		printer.printMessageLevel1("Showing how to beat eggs to the apprentice (masterPastryChef)");
		printer.printMessageLevel2("Adding behabiour when beating eggs (masterPastryChef)");
		printer.printMessageLevel3("Beating eggs with vanilla extract for souffle");
	}

	private void addStateToBakeSouffle() {
		printer.printMessageLevel2("Adding state when baking (masterPastryChef)");
		Clock clock = new Clock();

		if (!Oven.getInstance().isReady()) {
			printer.printMessageLevel3("Waiting for the oven to be ready for baking (masterPastryChef)");
			clock.setAlarmDelay(OVEN_DELAY);
		}
		printer.printMessageLevel3("Baking souffle");

		printer.printMessageLevel3("Setting state in oven");
		Oven.getInstance().setLastTimeUsage(clock.getCurrentDate());
	}
}
