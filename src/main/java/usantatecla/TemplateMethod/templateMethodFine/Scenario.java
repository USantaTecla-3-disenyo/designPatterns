package usantatecla.TemplateMethod.templateMethodFine;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("TEMPLATE METHOD FINE");
		
		Student student = new Student();

		printer.printSubTitle("STUDENT ATTENDING A COURSE IN CLASSROOM");
		Professor professorInClassRoom = new ProfessorInClassRoom();
		student.attendCourse(professorInClassRoom);
		
		printer.printSubTitle("STUDENT ATTENDING A COURSE IN FIELD");
		Professor professorInField = new ProfessorInField();
		student.attendCourse(professorInField);
	}
}