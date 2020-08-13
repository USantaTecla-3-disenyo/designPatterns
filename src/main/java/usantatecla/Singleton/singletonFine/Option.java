package usantatecla.Singleton.singletonFine;

import usantatecla.Utils.utils.Printer;

public class Option {

	private String title;

	public Option(String tittle) {
		this.title = tittle;
	}

	public void print() {
		Printer.getInstance().printMessageLevel1(this.title);
	}

}
