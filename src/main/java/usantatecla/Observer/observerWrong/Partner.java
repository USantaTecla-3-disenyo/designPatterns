package usantatecla.Observer.observerWrong;

import usantatecla.Observer.observerWrong.Person.TroubleReason;
import usantatecla.Utils.utils.Printer;

public class Partner {

	private Printer printer = Printer.getInstance();

	private Person person;

	public void setPerson(Person person) {
		this.person = person;
	}

	public void update() {
		printer.printMessageLevel3("Partner notified of unhappy person = " + this.person.isInTrouble());
		if (this.person.getTroubleReason() == TroubleReason.ILL) {
			printer.printMessageLevel4("Partner taking you to doctor");
		} else if (this.person.getTroubleReason() == TroubleReason.SAD) {
			printer.printMessageLevel4("Partner giving you a hug");
		}
	}

	@Override
	public String toString() {
		return "partner";
	}
}