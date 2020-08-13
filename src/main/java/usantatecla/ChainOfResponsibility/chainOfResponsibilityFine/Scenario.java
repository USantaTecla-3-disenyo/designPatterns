package usantatecla.ChainOfResponsibility.chainOfResponsibilityFine;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("CHAIN OF RESPONSIBILITY BETTER");

		ClaimSolver studentDefender = new StudentDefender();
		ClaimSolver provost = new Provost(studentDefender);
		ClaimSolver dean = new Dean(provost);
		ClaimSolver educationAffairsViceDean = new EducationAffairsViceDean(dean);
		ClaimSolver departmentHeadMaster = new DepartmentHeadMaster(educationAffairsViceDean);
		ClaimSolver subjectCoordinator = new SubjectCoordinator(departmentHeadMaster);
		ClaimSolver professor = new Professor(subjectCoordinator);

		printer.printSubTitle("STUDENT COMPLAINING");

		Student student = new Student(professor);
		student.complainAboutExam();
		student.complainAboutDepartmentRule();
	}
}