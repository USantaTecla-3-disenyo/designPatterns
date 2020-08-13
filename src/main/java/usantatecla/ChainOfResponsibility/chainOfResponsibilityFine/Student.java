package usantatecla.ChainOfResponsibility.chainOfResponsibilityFine;

import usantatecla.Utils.utils.Printer;

public class Student {

	private Printer printer = Printer.getInstance();

	private ClaimSolver claimSolver;

	public Student(ClaimSolver claimSolver) {
		this.claimSolver = claimSolver;
	}

	public void complainAboutExam() {
		printer.printMessageLevel1("Complaining about exam (student)");
		claimSolver.handleComplainAboutExam();
	}

	public void complainAboutDepartmentRule() {
		printer.printMessageLevel1("Complaining about department rule (student)");
		claimSolver.handleComplainAboutDepartmentRule();
	}
}
