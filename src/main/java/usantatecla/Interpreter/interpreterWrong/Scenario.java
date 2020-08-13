package usantatecla.Interpreter.interpreterWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("INTERPRETER WRONG");

		Operator operator = new Operator();
		Machine machine = new Machine();

		printer.printSubTitle("OPERATOR FOLLOWING MORNING PROTOCOL");
		operator.performMorningProtocol(machine);

		printer.printSubTitle("OPERATOR FOLLOWING EVENING PROTOCOL");
		operator.performEveningProtocol(machine);
	}
}