package usantatecla.Prototype.prototypeFineWithRegistry;

import usantatecla.Utils.utils.Printer;

public class Poem {

	private Printer printer = Printer.getInstance();

	protected String title;
	protected String author;
	protected String content;

	public Poem copy() {
		printer.printMessageLevel2("Creating a copy of poem " + this.title + " (poem)");
		return new Poem(this.title, this.author, this.content);
	}

	protected Poem(String title, String author, String content) {
		this.title = title;
		this.author = author;
		this.content = content;
	}

	public void recite() {
		printer.printMessageLevel2("Reciting " + this.title + " from " + this.author + " (poem): " + this.content);
	}
}