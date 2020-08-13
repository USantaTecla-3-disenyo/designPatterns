package usantatecla.Observer.observerFine;

public class Woman extends Person {

	public void getPregnant() {
		printer.printMessageLevel1("\nGetting pregnant");
	}
		
	public void havePreeclampsia() {
		printer.printMessageLevel1("\nHaving preeclampsia");
		this.setInTrouble(TroubleReason.ILL);
	}

	@Override
	public String toString() {
		return "woman";
	}
}