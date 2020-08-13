package usantatecla.Bridge.bridgeFine;

public class CasualAdviser extends Adviser {

	public CasualAdviser() {
		super();
		printer.printMessageLevel1("Creating casualAdviser");
	}

	@Override
	public void advise() {
		printer.printMessageLevel1("Advising superficially (casualAdviser)");
		super.advise();
	}

}
