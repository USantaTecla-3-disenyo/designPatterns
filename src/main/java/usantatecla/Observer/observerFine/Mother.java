package usantatecla.Observer.observerFine;

public class Mother extends KnownPeople {

	private Person person;

	@Override
	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public void update() {
		printer.printMessageLevel3("Mother notified of unhappy person = " + this.person.isInTrouble());
		switch (this.person.getTroubleReason()) {
		case SAD:
			printer.printMessageLevel4("Mother conforting you by phone");
			break;
		case ILL:
			printer.printMessageLevel4("Mother visiting you and bringing food");
			break;
		case WITHOUT_MONEY:
			printer.printMessageLevel4("Mother lending you money");
			break;
		}
	}

	@Override
	public String toString() {
		return "mother";
	}
}
