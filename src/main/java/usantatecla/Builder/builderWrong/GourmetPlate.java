package usantatecla.Builder.builderWrong;

import usantatecla.Utils.utils.Printer;

public class GourmetPlate {

	private Printer printer = Printer.getInstance();

	private Oyster oyster;
	private Souffle lobster;
	private Sirloin sirloin;

	public void addOyster(Oyster oyster) {
		this.oyster = oyster;
		printer.printMessageLevel2("Adding oyster to gourmet plate");
	}

	public void addLobster(Souffle lobster) {
		this.lobster = lobster;
		printer.printMessageLevel2("Adding lobster to gourmet plate");
	}

	public void addSirloin(Sirloin sirloin) {
		this.sirloin = sirloin;
		printer.printMessageLevel2("Adding sirloin to gourmet plate");
	}

	@Override
	public String toString() {
		return "GourmetPlate [oyster=" + this.oyster + ", lobster=" + this.lobster + ", sirloin=" + this.sirloin + "]";
	}
}
