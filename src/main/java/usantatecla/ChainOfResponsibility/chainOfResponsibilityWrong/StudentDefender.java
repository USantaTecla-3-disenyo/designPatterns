package usantatecla.ChainOfResponsibility.chainOfResponsibilityWrong;

import java.util.Random;
import usantatecla.Utils.utils.Printer;

public class StudentDefender {

	private Printer printer = Printer.getInstance();

	enum SolvingSkill {
		TRUE, FALSE
	};

	private int generateRandomSolvingSkill() {
		Random randomSolvingSkill = new Random();
		return randomSolvingSkill.nextInt(SolvingSkill.values().length);
	}

	public boolean handleComplainAboutExam() {
		printer.printMessageLevel1("Received complain about exam (studentDefender)");

		if (this.generateRandomSolvingSkill() == SolvingSkill.TRUE.ordinal()) {
			printer.printMessageLevel2("SOLVED (studentDefender)");
			return true;
		}
		return false;
	}

	public boolean handleComplainAboutDepartmentRule() {
		printer.printMessageLevel1("Received complain about department rule (studentDefender)");
		if (this.generateRandomSolvingSkill() == SolvingSkill.TRUE.ordinal()) {
			printer.printMessageLevel2("SOLVED (studentDefender)");
			return true;
		}
		return false;
	}
}
