package usantatecla.Bridge.bridgeWrong;

public class CasualLegalAdviser extends CasualAdviser {

	public CasualLegalAdviser() {
		super();
		printer.printMessageLevel1("Creating casualLegalAdviser");
	}

	@Override
	public void advise() {
		printer.printMessageLevel1("Performing casual legal advise (casualLegalAdviser)");
		LawMinistry lawMinistry = new LawMinistry();
		lawMinistry.getData();
	}

}
