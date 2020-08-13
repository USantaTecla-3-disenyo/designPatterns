package usantatecla.ChainOfResponsibility.chainOfResponsibilityWrong;

import java.util.Random;
import usantatecla.Utils.utils.Printer;

public class SubjectCoordinator {

	private Printer printer = Printer.getInstance();

	enum SolvingSkill {
		TRUE, FALSE
	};

	private int generateRandomSolvingSkill() {
		Random randomSolvingSkill = new Random();
		return randomSolvingSkill.nextInt(SolvingSkill.values().length);
	}

	public boolean handleComplainAboutExam() {
		printer.printMessageLevel1("Received complain about exam (subjectCoordinator)");

		if (this.generateRandomSolvingSkill() == SolvingSkill.TRUE.ordinal()) {
			printer.printMessageLevel2("SOLVED (subjectCoordinator) \n");
			return true;
		}
		return false;
	}
}
