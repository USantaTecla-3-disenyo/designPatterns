package usantatecla.Observer.observerWrong;

import usantatecla.Utils.utils.Printer;

public abstract class Person {

	protected Printer printer = Printer.getInstance();

	enum TroubleReason {
		SAD, ILL, WITHOUT_MONEY
	};

	protected boolean inTrouble;
	protected TroubleReason troubleReason;

	protected Mother mother;
	protected Partner partner;
	protected Boss boss;

	public Person() {
		this.inTrouble = false;
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

	public void beBorn(Mother mother) {
		printer.printMessageLevel1("\nBe born (" + this.toString() + ")");
		this.attach(mother);
	}
	
	public void becomeOrphan(Mother mother) {
		printer.printMessageLevel1("\nBecome orphan (" + this.toString() + ")");
		this.detach(mother);
		this.loseALovedOne();
	}

	public void startRelationship(Partner partner) {
		printer.printMessageLevel1("\nStarting relationship (" + this.toString() + ")");
		this.attach(partner);
	}

	public void endRelationship(Partner partner) {
		printer.printMessageLevel1("\nEnding relationship (" + this.toString() + ")");
		this.detach(partner);
	}

	public void startJob(Boss boss) {
		printer.printMessageLevel1("\nStarting job (" + this.toString() + ")");
		this.attach(boss);
	}

	public void endJob(Boss boss) {
		printer.printMessageLevel1("\nEnding job (" + this.toString() + ")");
		this.detach(boss);
	}

	private void attach(Mother mother) {
		printer.printMessageLevel2("Attaching " + mother.toString() + "(" + this.toString() + ")");
		this.mother = mother;
		mother.setPerson(this);
	}

	private void detach(Mother mother) {
		printer.printMessageLevel2("Detaching " + mother.toString() + "(" + this.toString() + ")");
		this.mother = null;
		mother.setPerson(null);
	}

	private void attach(Partner partner) {
		printer.printMessageLevel2("Attaching " + partner.toString() + "(" + this.toString() + ")");
		this.partner = partner;
		partner.setPerson(this);
	}

	private void detach(Partner partner) {
		printer.printMessageLevel2("Detaching " + partner.toString() + "(" + this.toString() + ")");
		this.partner = null;
		partner.setPerson(null);
	}

	private void attach(Boss boss) {
		printer.printMessageLevel2("Attaching " + boss.toString() + "(" + this.toString() + ")");
		this.boss = boss;
		boss.setPerson(this);
	}

	private void detach(Boss boss) {
		printer.printMessageLevel2("Detaching " + boss.toString() + "(" + this.toString() + ")");
		this.boss = null;
		boss.setPerson(null);
	}
	
	private boolean isNotOrphan() {
		return this.mother!=null;
	}
	
	private boolean isInRelationship() {
		return this.partner!=null;
	}
	
	private boolean isEmployed() {
		return this.boss!=null;
	}

	public void notifyKnownPeople() {
		if (this.isNotOrphan())
			mother.update();
		if (this.isInRelationship())
			partner.update();
		if (this.isEmployed())
			boss.update();
	}
}