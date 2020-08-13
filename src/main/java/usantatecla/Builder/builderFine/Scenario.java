package usantatecla.Builder.builderFine;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("BUILDER FINE");

		Person person = new Person();

		printer.printSubTitle("PERSON EATING A COMBINATION PLATE");
		BasicChef basicChef = new BasicChef();
		person.eat(basicChef);

		printer.printSubTitle("PERSON EATING A GOURMET PLATE");
		GourmetChef gourmetChef = new GourmetChef();
		person.eat(gourmetChef);
	}
}