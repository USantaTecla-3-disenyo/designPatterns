package usantatecla.TemplateMethod.templateMethodWrong;

import java.util.Random;

import usantatecla.Utils.utils.Printer;

public class Professor {

	protected Printer printer = Printer.getInstance();
	
	enum Location {
		CLASSROOM, FIELD
	};
	
	private int generateRandomLocation() {
		Random randomLocation = new Random();
		return randomLocation.nextInt(Location.values().length);
	}

	public void teach() {
		int professorLocation = this.generateRandomLocation();
		this.introduceYourself();
		this.introduceCourse();
		if (professorLocation == Location.CLASSROOM.ordinal())
			this.explainSubjectInClassRoom();
		else if (professorLocation == Location.FIELD.ordinal())
			this.explainSubjectInField();
		this.answerDoubts();
		if (professorLocation == Location.CLASSROOM.ordinal())
			this.assessInClassRoom();
		else if (professorLocation == Location.FIELD.ordinal())
			this.assessInField();
		this.concludeCourse();
	}

	private void introduceYourself() {
		this.printer.printMessageLevel2("Introducing yourself (professor)");
		this.printer.printMessageLevel3("bla bla bla ... (professor)");
	}
	
	private void introduceCourse() {
		this.printer.printMessageLevel2("Introducing course (professor)");
		this.printer.printMessageLevel3("bla bla bla ... (professor)");
	}
	
	private void answerDoubts() {
		this.printer.printMessageLevel2("Answering doubts (professor)");
		this.printer.printMessageLevel3("Asking for doubts (professor)");
		this.printer.printMessageLevel3("Answering doubts (professor)");
	}
	
	private void concludeCourse() {
		this.printer.printMessageLevel2("Concluding course (professor)");
		this.printer.printMessageLevel3("bla bla bla ... (professor)");
	}
	
	private void explainSubjectInClassRoom() {
		this.printer.printMessageLevel2("Explaining subject (professorInClassRoom)");
		this.printer.printMessageLevel3("Switch on projector (professorInClassRoom)");
		this.printer.printMessageLevel3("Explain subject thoroughly (professorInClassRoom)");
		this.printer.printMessageLevel3("Switch off projector (professorInClassRoom)");
	}

	private void assessInClassRoom() {
		this.printer.printMessageLevel2("Assesing (professorInClassRoom)");
		this.printer.printMessageLevel3("Provide exam by Moodle (professorInClassRoom)");
		this.printer.printMessageLevel3("Trigger automatic correction in Moodle (professorInClassRoom)");
	}
	
	private void explainSubjectInField() {
		this.printer.printMessageLevel2("Explaining subject (professorInField)");
		this.printer.printMessageLevel3("Clean board (professorInField)");
		this.printer.printMessageLevel3("Explain subject superficially (professorInField)");
	}

	private void assessInField() {
		this.printer.printMessageLevel2("Assesing (professorInField)");
		this.printer.printMessageLevel3("Provide exam in a sheet (professorInField)");
		this.printer.printMessageLevel3("Correct manually (professorInField)");
	}
}
