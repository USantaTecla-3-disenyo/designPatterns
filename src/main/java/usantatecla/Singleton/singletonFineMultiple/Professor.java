package usantatecla.Singleton.singletonFineMultiple;

import usantatecla.Utils.utils.Printer;

public class Professor {

	private Printer printer = Printer.getInstance();

	private String title;
	private SecurityGuard securityGuard;

	public Professor(String tittle) {
		this.title = tittle;
		this.securityGuard = SecurityGuard.getInstance();
	}

	@Override
	public String toString() {
		return "Professor [title=" + this.title + "]";
	}

	public void teach() {
		printer.printMessageLevel1("Teaching (professor)");
		this.securityGuard.openClassRoom();
		this.printer.printMessageLevel3("Introducing yourself (professor)");
		this.printer.printMessageLevel3("Introducing course (professor)");
		this.printer.printMessageLevel3("Explaining subject (professor)");
		this.printer.printMessageLevel3("Answering doubts (professor)");
		this.printer.printMessageLevel3("Concluding course (professor)");
		this.securityGuard.closeClassRoom();
	}
}