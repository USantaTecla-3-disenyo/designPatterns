package usantatecla.TemplateMethod.templateMethodWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("TEMPLATE METHOD FINE");
		
		Student student = new Student();
		Professor professor = new Professor();

		printer.printSubTitle("STUDENT ATTENDING A COURSE IN FIRST LOCATION");
		student.attendCourse(professor);
		
		printer.printSubTitle("STUDENT ATTENDING A COURSE IN SECOND LOCATION");
		student.attendCourse(professor);
	}
}