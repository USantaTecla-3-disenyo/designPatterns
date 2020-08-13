package usantatecla.Singleton.singletonWrong;

public class InterfaceView {

	private Menu menu;
	private Frame frame;
	private Status status;

	public InterfaceView(Printer printer) {
		this.menu = new Menu(printer);
		this.frame = new Frame(printer);
		this.status = new Status(printer);
	}

	public void print() {
		this.menu.print();
		this.frame.print();
		this.status.print();
	}
}