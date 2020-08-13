package usantatecla.TemplateMethod.templateMethodFine;

public class ProfessorInClassRoom extends Professor {

	@Override
	protected void explainSubject() {
		this.printer.printMessageLevel2("Explaining subject (professorInClassRoom)");
		this.printer.printMessageLevel3("Switch on projector (professorInClassRoom)");
		this.printer.printMessageLevel3("Explain subject thoroughly (professorInClassRoom)");
		this.printer.printMessageLevel3("Switch off projector (professorInClassRoom)");
	}

	@Override
	protected void assess() {
		this.printer.printMessageLevel2("Assesing (professorInClassRoom)");
		this.printer.printMessageLevel3("Provide exam by Moodle (professorInClassRoom)");
		this.printer.printMessageLevel3("Trigger automatic correction in Moodle (professorInClassRoom)");
	}
}
