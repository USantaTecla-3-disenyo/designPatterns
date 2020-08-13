package usantatecla.ChainOfResponsibility.chainOfResponsibilityWrong;

import java.util.Random;

import usantatecla.Utils.utils.Printer;

public class Provost {

	private Printer printer = Printer.getInstance();

	enum SolvingSkill {
		TRUE, FALSE
	};

	private int generateRandomSolvingSkill() {
		Random randomSolvingSkill = new Random();
		return randomSolvingSkill.nextInt(SolvingSkill.values().length);
	}

	public boolean handleComplainAboutExam() {
		printer.printMessageLevel1("Received complain about exam (provost)");

		if (this.generateRandomSolvingSkill() == SolvingSkill.TRUE.ordinal()) {
			printer.printMessageLevel2("SOLVED (provost) \n");
			return true;
		}
		return false;
	}

	public boolean handleComplainAboutDepartmentRule() {
		printer.printMessageLevel1("Received complain about department rule (provost)");
		if (this.generateRandomSolvingSkill() == SolvingSkill.TRUE.ordinal()) {
			printer.printMessageLevel2("SOLVED (provost) \n");
			return true;
		}
		return false;
	}
}
