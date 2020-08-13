package usantatecla.Bridge.bridgeFine;

import usantatecla.Utils.utils.Printer;

public class Adviser {

	protected Printer printer = Printer.getInstance();

	protected Analyst analyst;

	public void setAnalyst(Analyst analyst) {
		this.analyst = analyst;
	}

	public void advise() {
		this.analyst.analyze();
	}
}
