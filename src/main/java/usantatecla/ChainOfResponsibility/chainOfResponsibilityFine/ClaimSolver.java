package usantatecla.ChainOfResponsibility.chainOfResponsibilityFine;

import java.util.Random;

import usantatecla.Utils.utils.Printer;

public abstract class ClaimSolver {

	protected Printer printer = Printer.getInstance();

	enum SolvingSkill {
		TRUE, FALSE
	};

	protected ClaimSolver next;
	protected String name;

	protected ClaimSolver(ClaimSolver claimSolver) {
		this.next = claimSolver;
	}

	protected int generateRandomSolvingSkill() {
		Random randomSolvingSkill = new Random();
		return randomSolvingSkill.nextInt(SolvingSkill.values().length);
	}

	public void handleComplainAboutExam() {
		printer.printMessageLevel1("Received complain about exam (" + this.name + ")");
		printer.printMessageLevel2("Sent to next");
		if (this.next != null)
			next.handleComplainAboutExam();
	}

	public void handleComplainAboutDepartmentRule() {
		printer.printMessageLevel1("Received complain about department rule (" + this.name + ")");
		printer.printMessageLevel2("Sent to next");
		if (this.next != null)
			next.handleComplainAboutDepartmentRule();
	}
}
