package usantatecla.Interpreter.interpreterWrong;

import usantatecla.Utils.utils.Printer;

public class Machine {

	private static final int CONCATENATION_TIMES = 7;

	private Printer printer = Printer.getInstance();

	public void execute(String name) {
		printer.printMessageLevel4("Machine executing " + name + " (machine)");
		printer.printMessageLevel4(
				String.format("%0" + CONCATENATION_TIMES + "d", 0).replace("0", name) + " (machine)");
	}
}
