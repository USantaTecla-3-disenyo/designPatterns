package usantatecla.Singleton.singletonWrong;

public class DataView {

	private Printer printer;

	public DataView(Printer printer) {
		this.printer = printer;
	}

	public void print() {
		this.printer.printMessageLevel1("Printing dataView");
	}

}
