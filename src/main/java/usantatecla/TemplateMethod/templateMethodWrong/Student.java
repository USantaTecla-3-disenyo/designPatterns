package usantatecla.TemplateMethod.templateMethodWrong;

import usantatecla.Utils.utils.Printer;

public class Student {
	
	private Printer printer = Printer.getInstance();
	
	public void attendCourse(Professor professor) {
		printer.printMessageLevel1("Attend course (student)");
		professor.teach();
	}
}
