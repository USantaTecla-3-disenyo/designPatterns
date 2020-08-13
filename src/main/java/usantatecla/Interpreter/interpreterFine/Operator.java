package usantatecla.Interpreter.interpreterFine;

import usantatecla.Utils.utils.Printer;

public class Operator {

	private Printer printer = Printer.getInstance();

	public void performProtocol(Script script, Machine machine) {
		printer.printMessageLevel1("Performing protocol (operator)");
		script.execute(machine);
	}
}
