package usantatecla.Prototype.prototypeWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("PROTOTYPE WRONG");

		Poet poet = new Poet();
		Poem requestedPoem;

		printer.printSubTitle("POET SELLING 'LA CASADA INFIEL'");
		requestedPoem = poet.sell("La Casada Infiel");
		printer.printMessageLevel2("Hash code of the poem = " + requestedPoem.hashCode());
		requestedPoem.recite();

		printer.printSubTitle("POET SELLING 'POEMA XX'");
		requestedPoem = poet.sell("Poema XX");
		printer.printMessageLevel2("Hash code of the poem = " + requestedPoem.hashCode());
		requestedPoem.recite();

		printer.printSubTitle("POET SELLING 'LA CASADA INFIEL'");
		requestedPoem = poet.sell("La Casada Infiel");
		printer.printMessageLevel2("Hash code of the poem = " + requestedPoem.hashCode());
		requestedPoem.recite();
	}
}
