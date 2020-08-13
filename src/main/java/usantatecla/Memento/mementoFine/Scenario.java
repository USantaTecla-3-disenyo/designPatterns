package usantatecla.Memento.mementoFine;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("MEMENTO FINE");

		Person person = new Person();

		printer.printSubTitle("PERSON PREPARING PLAN AND CREATING ARCHIVE FOR THE PLAN");
		person.createPlan();

		printer.printSubTitle("PERSON PERFORMING MODIFICATIONS IN PLAN");
		person.modifyPlan();

		printer.printSubTitle("PERSON UNDOING MODIFICATIONS OF PLAN");
		person.undoPlanModification();
		person.undoPlanModification();
		person.undoPlanModification();

		printer.printSubTitle("PERSON REDOING MODIFICATIONS OF PLAN");
		person.redoPlanModification();
		person.redoPlanModification();
		person.redoPlanModification();

		printer.printSubTitle("PERSON REVIEWING ALL VERSIONS OF PLAN");
		person.reviewAllPlanVersions();
	}
}