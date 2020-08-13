package usantatecla.ChainOfResponsibility.chainOfResponsibilityWrong;

import usantatecla.Utils.utils.Printer;

public class Student {

	private Printer printer = Printer.getInstance();

	private Professor professor;
	private SubjectCoordinator subjectCoordinator;
	private DepartmentHeadMaster departmentHeadMaster;
	private EducationAffairsViceDean educationAffairsViceDean;
	private Dean dean;
	private Provost provost;
	private StudentDefender studentDefender;

	public Student(Professor professor, SubjectCoordinator subjectCoordinator,
			DepartmentHeadMaster departmentHeadMaster, EducationAffairsViceDean educationAffairsViceDean, Dean dean,
			Provost provost, StudentDefender studentDefender) {
		this.professor = professor;
		this.subjectCoordinator = subjectCoordinator;
		this.departmentHeadMaster = departmentHeadMaster;
		this.educationAffairsViceDean = educationAffairsViceDean;
		this.dean = dean;
		this.provost = provost;
		this.studentDefender = studentDefender;
	}

	public void complainAboutExam() {
		printer.printMessageLevel1("Complaining about professor behaviour (student)");
		if (!this.professor.handleComplainAboutExam()) {
			printer.printMessageLevel2("Sent to next");
			if (!this.subjectCoordinator.handleComplainAboutExam()) {
				printer.printMessageLevel2("Sent to next");
				if (!this.departmentHeadMaster.handleComplainAboutExam()) {
					printer.printMessageLevel2("Sent to next");
					if (!this.educationAffairsViceDean.handleComplainAboutExam()) {
						printer.printMessageLevel2("Sent to next");
						if (!this.dean.handleComplainAboutExam()) {
							printer.printMessageLevel2("Sent to next");
							if (!this.provost.handleComplainAboutExam()) {
								printer.printMessageLevel2("Sent to next");
								if (!this.studentDefender.handleComplainAboutExam()) {
									printer.printMessageLevel1("NOT SOLVED \n");
								}
							}
						}
					}
				}
			}
		}
	}

	public void complainAboutDepartmentRule() {
		printer.printMessageLevel1("Complaining about department rule (student)");
		if (!this.departmentHeadMaster.handleComplainAboutDepartmentRule()) {
			printer.printMessageLevel2("Sent to next");
			if (!this.educationAffairsViceDean.handleComplainAboutDepartmentRule()) {
				printer.printMessageLevel2("Sent to next");
				if (!this.dean.handleComplainAboutDepartmentRule()) {
					printer.printMessageLevel2("Sent to next");
					if (!this.provost.handleComplainAboutDepartmentRule()) {
						printer.printMessageLevel2("Sent to next");
						if (!this.studentDefender.handleComplainAboutDepartmentRule()) {
							printer.printMessageLevel1("NOT SOLVED \n");
						}
					}
				}
			}
		}
	}
}
