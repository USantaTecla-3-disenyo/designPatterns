package usantatecla.Composite.compositeFine;

public class Person extends Player {

	public Person(String name) {
		super();
		printer.printMessageLevel1("Creating person " + name);
		this.name = name;
	}

	public String play() {
		return this.name + ": Giving an answer for the question (person) \n";
	}
}
