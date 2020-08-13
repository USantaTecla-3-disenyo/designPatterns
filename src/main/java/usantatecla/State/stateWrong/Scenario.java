package usantatecla.State.stateWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("STATE WRONG");

		Person person = new Person();

		printer.printSubTitle("PERSON GOING TO WORK");
		person.work();

		printer.printSubTitle("PERSON EATING");
		person.eat();
		
		printer.printSubTitle("PERSON DANCING");
		person.dance();
		
		printer.printSubTitle("PERSON EATING");
		person.eat();
	}
}