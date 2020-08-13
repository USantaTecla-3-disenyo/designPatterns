package usantatecla.Bridge.bridgeWrong;

public class FormalLegalAdviser extends CasualAdviser {

	public FormalLegalAdviser() {
		super();
		printer.printMessageLevel1("Creating formalLegalAdviser");
	}

	@Override
	public void advise() {
		printer.printMessageLevel1("Performing formal legal advise (formalLegalAdviser)");
		LawMinistry lawMinistry = new LawMinistry();
		lawMinistry.getData();
	}

}
