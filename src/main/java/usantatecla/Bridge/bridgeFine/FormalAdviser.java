package usantatecla.Bridge.bridgeFine;

public class FormalAdviser extends Adviser {

	public FormalAdviser() {
		super();
		printer.printMessageLevel1("Creating formalAdviser");
	}

	@Override
	public void advise() {
		printer.printMessageLevel1("Advising thoroughfully (formalAdviser)");
		super.advise();
	}
}
