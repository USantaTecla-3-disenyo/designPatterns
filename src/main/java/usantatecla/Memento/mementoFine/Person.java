package usantatecla.Memento.mementoFine;

import java.util.ArrayList;
import java.util.Date;

import usantatecla.Utils.utils.Printer;

public class Person {

	private Printer printer = Printer.getInstance();

	private PlanArchive planArchive;
	private Plan plan;
	
	public void createPlan() {
		printer.printMessageLevel1("Preparing plan (person)");
		ArrayList<String> participants = new ArrayList<String>();
		participants.add("Alex");
		participants.add("Helen");
		ArrayList<String> details = new ArrayList<String>();
		details.add("Day 1: Drive to Chamonix");
		details.add("Day 2: Visit Mer de Glace with Montenvers train");
		details.add("Day 3: Climb Petit Aiguille Verte ");
		details.add("Day 4: Visit Aiguille du Midi with cable car");
		details.add("Day 5: Climb to Montblanc via Ar�te des Cosmiques");
		details.add("Day 6: Visit Gorges de la Diosaz");
		details.add("Day 7: Via Ferrata Curalla");
		details.add("Day 8: Visit Refuge du Nid D'Aigle with Tramway du Montblanc");
		this.plan = new Plan("SummerPlan to Chamonix", new Date(), participants, details);
		this.planArchive = new PlanArchive(this.plan);
		this.planArchive.registry();
		printer.printMessageLevel1(this.plan.toString());
	}

	public void modifyPlan() {
		printer.printMessageLevel1("Modifying plan (person)");
		this.plan.removeDetail("Day 8: Visit Refuge du Nid D'Aigle with Tramway du Montblanc");
		this.planArchive.registry();
		this.plan.removeDetail("Day 7: Via Ferrata Curalla");
		this.planArchive.registry();
		this.plan.setTitle("SummerPlan to Chamonix and Zermatt");
		this.planArchive.registry();
		this.plan.addDetail("Day 7: Drive to Zermatt");
		this.planArchive.registry();
		this.plan.addDetail("Day 8: Trek to H�rnlih�tte");
		this.planArchive.registry();
		this.plan.addDetail("Day 9: Climb Matterhorn via Hornli");
		this.planArchive.registry();
		this.plan.addDetail("Day 10: Drive back to Chamonix");
		this.planArchive.registry();
		this.plan.addParticipant("Maria");
		this.planArchive.registry();
		this.plan.removeParticipant("Alex");
		this.planArchive.registry();
		printer.printMessageLevel1(this.plan.toString());
	}

	public void undoPlanModification() {
		assert this.planArchive.isUndoable();
		printer.printMessageLevel1("Undoing last change in plan (person)");
		this.planArchive.undo();
		printer.printMessageLevel1(this.plan.toString());
	}

	public void redoPlanModification() {
		assert this.planArchive.isRedoable();
		printer.printMessageLevel1("Redoing last change in plan (person)");
		this.planArchive.redo();
		printer.printMessageLevel1(this.plan.toString());
	}
	
	public void reviewAllPlanVersions() {
		printer.printMessageLevel1(this.planArchive.toString());
	}
}
