package usantatecla.Singleton.singletonWrong;

public class TimeView {

	private Printer printer;

	public TimeView(Printer printer) {
		this.printer = printer;
	}

	public void print() {
		this.printer.printMessageLevel1("Printing timeView");
	}

}
