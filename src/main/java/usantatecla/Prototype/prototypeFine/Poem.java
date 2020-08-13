package usantatecla.Prototype.prototypeFine;

import java.util.HashMap;

import usantatecla.Utils.utils.Printer;

public class Poem {

	private static Printer printer = Printer.getInstance();

	private static HashMap<String, Poem> poems;
	static {
		printer.printMessageLevel1("Generating prototypes (poem)");
		Poem.poems = new HashMap<String, Poem>();
		Poem poem;
		poem = new LaCasadaInfiel();
		Poem.addPoem(poem);
		poem = new PoemaXX();
		Poem.addPoem(poem);
	}

	protected String title;
	protected String author;
	protected String content;

	private static void addPoem(Poem poem) {
		printer.printMessageLevel2("Prototype for " + poem.title);
		Poem.poems.put(poem.title, poem);
	}

	public static Poem getPoem(String title) {
		return Poem.poems.get(title);
	}

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
