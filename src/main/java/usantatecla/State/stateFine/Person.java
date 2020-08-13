package usantatecla.State.stateFine;

import usantatecla.Utils.utils.Printer;

public class Person {

	private Printer printer = Printer.getInstance();

	enum AvailableMood {
		HAPPY, SAD;
	}

	private Mood mood;

	public Person() {
		this.mood = new Happy();
		printer.printMessageLevel1("Creating person with Happy mood");
	}

	public void eat() {
		this.mood.eat();
		printer.printMessageLevel3("Keeping state");
	}

	public void dance() {
		this.mood.dance();
		printer.printMessageLevel3("Setting state to Happy");
		this.mood = new Happy();
	}

	public void work() {
		this.mood.work();
		printer.printMessageLevel3("Setting state to Sad");
		this.mood = new Sad();
	}
}
