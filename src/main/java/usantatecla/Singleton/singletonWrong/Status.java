package usantatecla.Singleton.singletonWrong;

public class Status {

	private TimeView timeView;
	private DataView dataView;

	public Status(Printer printer) {
		this.timeView = new TimeView(printer);
		this.dataView = new DataView(printer);
	}

	public void print() {
		this.timeView.print();
		this.dataView.print();
	}

}
