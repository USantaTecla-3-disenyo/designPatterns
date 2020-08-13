package usantatecla.TemplateMethod.templateMethodFine;

public class ProfessorInField extends Professor {

	@Override
	protected void explainSubject() {
		this.printer.printMessageLevel2("Explaining subject (professorInField)");
		this.printer.printMessageLevel3("Clean board (professorInField)");
		this.printer.printMessageLevel3("Explain subject superficially (professorInField)");
	}

	@Override
	protected void assess() {
		this.printer.printMessageLevel2("Assesing (professorInField)");
		this.printer.printMessageLevel3("Provide exam in a sheet (professorInField)");
		this.printer.printMessageLevel3("Correct manually (professorInField)");
	}
}
