package usantatecla.Singleton.singletonWrong;

public class Option {

	private Printer printer;
	private String title;

	public Option(String tittle, Printer printer) {
		this.title = tittle;
		this.printer = new Printer();
	}

	public void print() {
		this.printer.printMessageLevel1(this.title);
	}

}
