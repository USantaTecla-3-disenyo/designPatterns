package usantatecla.Observer.observerWrong;

import usantatecla.Observer.observerWrong.Person.TroubleReason;
import usantatecla.Utils.utils.Printer;

public class Boss {

	private Printer printer = Printer.getInstance();

	private Person person;

	public void setPerson(Person person) {
		this.person = person;
	}

	public void update() {
		printer.printMessageLevel3("Boss notified of unhappy person = " + this.person.isInTrouble());
		if (this.person.getTroubleReason() == TroubleReason.ILL)
			printer.printMessageLevel4("Boss giving you a sick leave");
	}

	@Override
	public String toString() {
		return "boss";
	}
}