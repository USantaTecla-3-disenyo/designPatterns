package usantatecla.Observer.observerFine;

import usantatecla.Observer.observerFine.Person.TroubleReason;

public class Boss extends KnownPeople {

	private Person person;

	@Override
	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
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