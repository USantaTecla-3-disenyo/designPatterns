package usantatecla.Observer.observerFine;

import usantatecla.Utils.utils.Printer;

public abstract class KnownPeople {

	protected Printer printer = Printer.getInstance();

	public abstract void update();

	protected abstract void setPerson(Person person);

}