package usantatecla.ChainOfResponsibility.chainOfResponsibilityWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("CHAIN OF RESPONSIBILITY WRONG");

		StudentDefender studentDefender = new StudentDefender();
		Provost provost = new Provost();
		Dean dean = new Dean();
		EducationAffairsViceDean educationAffairsViceDean = new EducationAffairsViceDean();
		DepartmentHeadMaster departmentHeadMaster = new DepartmentHeadMaster();
		SubjectCoordinator subjectCoordinator = new SubjectCoordinator();
		Professor professor = new Professor();

		printer.printSubTitle("STUDENT COMPLAINING");

		Student student = new Student(professor, subjectCoordinator, departmentHeadMaster, educationAffairsViceDean,
				dean, provost, studentDefender);
		student.complainAboutExam();
		student.complainAboutDepartmentRule();
	}
}