package usantatecla.TemplateMethod.templateMethodFine;

import usantatecla.Utils.utils.Printer;

public abstract class Professor {

	protected Printer printer = Printer.getInstance();

	public void teach() {
		this.introduceYourself();
		this.introduceCourse();
		this.explainSubject();
		this.answerDoubts();
		this.assess();
		this.concludeCourse();
	}

	protected abstract void explainSubject();
	protected abstract void assess();

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
}
