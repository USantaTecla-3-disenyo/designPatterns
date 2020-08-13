package usantatecla.Composite.compositeFine;

import usantatecla.Utils.utils.Printer;

public abstract class Player {

	protected Printer printer = Printer.getInstance();

	protected String name;

	protected String getName() {
		return this.name;
	}

	public abstract String play();
}
