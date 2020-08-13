package usantatecla.Singleton.singletonWrong;

public class SubFrameA {

	private Printer printer;

	public SubFrameA(Printer printer) {
		this.printer = printer;
	}

	public void print() {
		this.printer.printMessageLevel1("Printing subFrameA");
	}

}
