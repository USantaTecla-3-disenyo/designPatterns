package usantatecla.Observer.observerWrong;

import usantatecla.Utils.utils.Printer;

public class Mother {

	private Printer printer = Printer.getInstance();

	private Person person;

	public void setPerson(Person person) {
		this.person = person;
	}

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
