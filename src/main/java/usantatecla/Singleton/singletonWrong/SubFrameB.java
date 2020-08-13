package usantatecla.Singleton.singletonWrong;

public class SubFrameB {

	private Printer printer;

	public SubFrameB(Printer printer) {
		this.printer = printer;
	}

	public void print() {
		this.printer.printMessageLevel1("Printing subFrameB");
	}

}
