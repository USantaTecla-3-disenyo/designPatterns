package usantatecla.Observer.observerWrong;

import usantatecla.Observer.observerFine.Man;
import usantatecla.Observer.observerFine.Woman;
import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("OBSERVER FINE");
		
		Fate fate = new Fate();

		printer.printSubTitle("MAN LEAVING HIS LIFE");
		Man man = new Man();
		fate.provideLifeEventsForMen(man);
		
		printer.printSubTitle("WOMAN LEAVING HIS LIFE");
		Woman woman = new Woman();
		fate.provideLifeEventsForWomen(woman);
	}
}
