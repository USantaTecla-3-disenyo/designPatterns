package usantatecla.Observer.observerFine;

import java.util.ArrayList;

import usantatecla.Utils.utils.Printer;

public abstract class Person {

	protected Printer printer = Printer.getInstance();

	enum TroubleReason {
		SAD, ILL, WITHOUT_MONEY
	};

	protected ArrayList<KnownPeople> knownPeople;
	protected boolean inTrouble;
	protected TroubleReason troubleReason;

	public Person() {
		this.inTrouble = false;
		this.knownPeople = new ArrayList<KnownPeople>();
	}

	public boolean isInTrouble() {
		return this.inTrouble;
	}

	public void setInTrouble(TroubleReason troubleReason) {
		this.inTrouble = true;
		this.troubleReason = troubleReason;
		if (this.inTrouble) {
			printer.printMessageLevel2("In trouble, notifying known people (" + this.toString() + ")");
			this.notifyKnownPeople();
		}
	}

	public TroubleReason getTroubleReason() {
		return this.troubleReason;
	}

	public void loseALovedOne() {
		printer.printMessageLevel1("\nLosing a loved one (" + this.toString() + ")");
		this.setInTrouble(TroubleReason.SAD);
	}

	public void haveAFlue() {
		printer.printMessageLevel1("\nHaving a flu (" + this.toString() + ")");
		this.setInTrouble(TroubleReason.ILL);
	}

	public void wasteAllSavings() {
		printer.printMessageLevel1("\nWasting all savings (" + this.toString() + ")");
		this.setInTrouble(TroubleReason.WITHOUT_MONEY);
	}
	
	public void beBorn (KnownPeople knownPeople) {
		printer.printMessageLevel1("\nBeing born (" + this.toString() + ")");
		this.attach(knownPeople);
	}
	
	public void becomeOrphan (KnownPeople knownPeople) {
		printer.printMessageLevel1("\nBecoming orphan (" + this.toString() + ")");
		this.detach(knownPeople);
		this.loseALovedOne();
	}
	
	public void startRelationship(KnownPeople knownPeople) {
		printer.printMessageLevel1("\nStarting relationship (" + this.toString() + ")");
		this.attach(knownPeople);
	}
	
	public void endRelationship(KnownPeople knownPeople) {
		printer.printMessageLevel1("\nEnding relationship (" + this.toString() + ")");
		this.detach(knownPeople);
	}
	
	public void startJob(KnownPeople knownPeople) {
		printer.printMessageLevel1("\nStarting job (" + this.toString() + ")");
		this.attach(knownPeople);
	}
	
	public void endJob(KnownPeople knownPeople) {
		printer.printMessageLevel1("\nEnding job (" + this.toString() + ")");
		this.detach(knownPeople);
	}

	private void attach(KnownPeople knownPeople) {
		printer.printMessageLevel2("Attaching " + knownPeople.toString() + "(" + this.toString() + ")");
		if (!this.knownPeople.contains(knownPeople)) {
			this.knownPeople.add(knownPeople);
			knownPeople.setPerson(this);
		}
	}

	private void detach(KnownPeople knownPeople) {
		printer.printMessageLevel2("Detaching " + knownPeople.toString() + "(" + this.toString() + ")");
		this.knownPeople.remove(knownPeople);
		knownPeople.setPerson(null);
	}

	private void notifyKnownPeople() {
		if (!this.knownPeople.isEmpty()) {
			for (KnownPeople knownPeople : this.knownPeople)
				knownPeople.update();
		}
	}
}