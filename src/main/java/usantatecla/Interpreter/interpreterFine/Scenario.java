package usantatecla.Interpreter.interpreterFine;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("INTERPRETER FINE");

		Operator operator = new Operator();
		Machine machine = new Machine();

		printer.printSubTitle("OPERATOR FOLLOWING MORNING PROTOCOL");
		Script morningProtocolScript = new MorningProtocolScript();
		operator.performProtocol(morningProtocolScript, machine);

		printer.printSubTitle("OPERATOR FOLLOWING EVENING PROTOCOL");
		Script eveningProtocolScript = new EveningProtocolScript();
		operator.performProtocol(eveningProtocolScript, machine);
	}
}