package usantatecla.Builder.builderWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("BUILDER WRONG");

		Person person = new Person();

		printer.printSubTitle("PERSON EATING FIRST DISH");
		person.eat();

		printer.printSubTitle("PERSON EATING SECOND DISH");
		person.eat();
	}
}