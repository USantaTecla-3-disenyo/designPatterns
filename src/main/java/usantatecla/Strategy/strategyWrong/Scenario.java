package usantatecla.Strategy.strategyWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("STATE FINE");
		
		Person person = new Person();

		printer.printSubTitle("PERSON FLIRTING WITH FIRST APPROACH");
		person.flirt();

		printer.printSubTitle("PERSON FLIRTING WITH SECOND APPROACH");
		person.flirt();
		
		printer.printSubTitle("PERSON FLIRTING WITH THIRD APPROACH");
		person.flirt();
		
		printer.printSubTitle("PERSON MAKING FRIENDSHIP WITH FIRST APPROACH");
		person.makeFriendship();

		printer.printSubTitle("PERSON MAKING FRIENDSHIP WITH SECOND APPROACH");
		person.makeFriendship();
		
		printer.printSubTitle("PERSON MAKING FRIENDSHIP WITH THIRD APPROACH");
		person.makeFriendship();
	}
}