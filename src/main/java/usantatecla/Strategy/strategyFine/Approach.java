package usantatecla.Strategy.strategyFine;

import usantatecla.Utils.utils.Printer;

public abstract class Approach {
	
	protected Printer printer = Printer.getInstance();
	
	protected abstract void approach();
	
}
