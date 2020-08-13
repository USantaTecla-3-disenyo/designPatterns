package usantatecla.Observer.observerFine;

import usantatecla.Observer.observerFine.Person.TroubleReason;

public class Partner extends KnownPeople {

	private Person person;

	@Override
	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
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