package usantatecla.ChainOfResponsibility.chainOfResponsibilityFine;

public class StudentDefender extends ClaimSolver {

	public StudentDefender() {
		super(null);
		this.name = this.getClass().getSimpleName().substring(0, 1).toLowerCase()
				+ this.getClass().getSimpleName().substring(1);
	}

	@Override
	public void handleComplainAboutExam() {
		printer.printMessageLevel1("Received complain about exam (" + this.name + ")");

		if (this.generateRandomSolvingSkill() == SolvingSkill.TRUE.ordinal()) {
			printer.printMessageLevel2("SOLVED (" + this.name + ")");
		} else if (this.next != null) {
			printer.printMessageLevel2("Sent to next");
			next.handleComplainAboutExam();
		}
		printer.printMessageLevel2("\n");
	}


	@Override
	public void handleComplainAboutDepartmentRule() {
		printer.printMessageLevel1("Received complain about department rule (" + this.name + ")");
		if (this.generateRandomSolvingSkill() == SolvingSkill.TRUE.ordinal()) {
			printer.printMessageLevel2("SOLVED (" + this.name + ")");
		} else if (this.next != null) {
			printer.printMessageLevel2("Sent to next");
			next.handleComplainAboutDepartmentRule();
			printer.printMessageLevel2("\n");
		}
	}
}
