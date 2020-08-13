package usantatecla.Singleton.singletonWrong;

import usantatecla.Utils.utils.Printer;

public class School {

	private Printer printer = Printer.getInstance();

	private static final int NUM_DEPARTMENTS = 3;

	private ManagementBoard managementBoard;
	private Department[] departments;

	public School() {
		SecurityGuard securityGuard = new SecurityGuard();
		this.managementBoard = new ManagementBoard(securityGuard);
		this.departments = new Department[NUM_DEPARTMENTS];
		for (int departmentId = 0; departmentId < NUM_DEPARTMENTS; departmentId++) {
			this.departments[departmentId] = new Department("department" + (departmentId + 1), securityGuard);
		}
	}

	public ManagementBoard getManagementBoard() {
		return this.managementBoard;
	}

	public Department[] getDepartments() {
		return this.departments;
	}

	public void startAcademicYear() {
		for (Department department : this.departments) {
			for (Professor professor : department.getProfessors()) {
				printer.printMessageLevel1("\n" + professor.toString() + " teaching");
				professor.teach();
			}
		}
	}

	@Override
	public String toString() {
		String schoolDetails = "School [\nmanagementBoard=\n";
		for (Professor professor : this.managementBoard.getProfessors()) {
			schoolDetails += "\t" + professor.toString() + "\n";
		}
		for (Department department : this.departments) {
			schoolDetails += department.toString() + "\n";
			for (Professor professor : department.getProfessors()) {
				schoolDetails += "\t" + professor.toString() + "\n";
			}
		}
		return schoolDetails + "]";
	}
}
