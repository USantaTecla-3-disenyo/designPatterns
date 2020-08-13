package usantatecla.Interpreter.interpreterFine;

import usantatecla.Utils.utils.Printer;

public abstract class Script {

	protected Printer printer = Printer.getInstance();

	public abstract void execute(Machine machine);
}
