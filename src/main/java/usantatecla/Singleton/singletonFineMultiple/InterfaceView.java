package usantatecla.Singleton.singletonFineMultiple;

public class InterfaceView {

	private Menu menu;
	private Frame frame;
	private Status status;

	public InterfaceView() {
		this.menu = new Menu();
		this.frame = new Frame();
		this.status = new Status();
	}

	public void print() {
		this.menu.print();
		this.frame.print();
		this.status.print();
	}
}