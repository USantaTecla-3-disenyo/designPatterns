package usantatecla.Singleton.singletonWrong;

public class Frame {

	private SubFrameA subFrameA;
	private SubFrameB subFrameB;

	public Frame(Printer printer) {
		this.subFrameA = new SubFrameA(printer);
		this.subFrameB = new SubFrameB(printer);
	}

	public void print() {
		this.subFrameA.print();
		this.subFrameB.print();
	}
}
