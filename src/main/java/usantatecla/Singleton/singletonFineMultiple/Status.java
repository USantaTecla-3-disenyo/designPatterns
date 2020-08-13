package usantatecla.Singleton.singletonFineMultiple;

public class Status {

	private TimeView timeView;
	private DataView dataView;

	public Status() {
		this.timeView = new TimeView();
		this.dataView = new DataView();
	}

	public void print() {
		this.timeView.print();
		this.dataView.print();
	}

}
