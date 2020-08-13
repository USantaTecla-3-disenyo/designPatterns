package usantatecla.Decorator.decoratorFine;

import usantatecla.Utils.utils.Printer;

public abstract class PastryChef {

	protected Printer printer = Printer.getInstance();

	public abstract void beat();

	public abstract void bake();

}
