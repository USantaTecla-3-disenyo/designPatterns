package usantatecla.Singleton.singletonFine;

public class Frame {

	private SubFrameA subFrameA;
	private SubFrameB subFrameB;

	public Frame() {
		this.subFrameA = new SubFrameA();
		this.subFrameB = new SubFrameB();
	}

	public void print() {
		this.subFrameA.print();
		this.subFrameB.print();
	}
}
