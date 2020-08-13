package usantatecla.Interpreter.interpreterWrong;

import usantatecla.Utils.utils.Printer;

public class Operator {

	private static final int SUBROUTINE_DE_TIMES = 2;
	private static final int OPERATION_F_TIMES = 3;
	private static final int SUBROUTINE_FED_TIMES = 2;

	private Printer printer = Printer.getInstance();

	public void performMorningProtocol(Machine machine) {
		printer.printMessageLevel1("Performing morningProtocolScript (operator)");
		this.performCompositeScriptForStarting(machine);
		this.performIterativeScriptForTasksDE(machine, SUBROUTINE_DE_TIMES);
		this.performIterativeScriptForTaskF(machine, OPERATION_F_TIMES);
	}

	public void performEveningProtocol(Machine machine) {
		printer.printMessageLevel1("Performing eveningProtocolScript (operator) \n");
		this.performOperation(machine, "D");
		this.performIterativeScriptForTasksFED(machine, SUBROUTINE_FED_TIMES);
		this.performCompositeScriptForSwitchingOff(machine);
	}

	private void performCompositeScriptForStarting(Machine machine) {
		printer.printMessageLevel1("Executing compositeScript (operator)");
		this.performOperation(machine, "A");
		this.performOperation(machine, "B");
		this.performOperation(machine, "C");
	}

	private void performIterativeScriptForTasksDE(Machine machine, int times) {
		printer.printMessageLevel1("Executing compositeScript (operator)");
		for (int time = 0; time < times; time++) {
			printer.printMessageLevel2(
					"\nExecuting iterativeScript (" + (times + 1) + " times out of " + times + ") (operator)");
			this.performOperation(machine, "D");
			this.performOperation(machine, "E");
		}
	}

	private void performIterativeScriptForTaskF(Machine machine, int times) {
		printer.printMessageLevel1("Executing compositeScript (operator)");
		for (int time = 0; time < times; time++) {
			printer.printMessageLevel2(
					"\nExecuting iterativeScript (" + (times + 1) + " times out of " + times + ") (operator)");
			this.performOperation(machine, "F");
		}
	}

	private void performIterativeScriptForTasksFED(Machine machine, int times) {
		printer.printMessageLevel1("Executing compositeScript (operator)");
		for (int time = 0; time < times; time++) {
			printer.printMessageLevel2(
					"\nExecuting iterativeScript (" + (times + 1) + " times out of " + times + ") (operator)");
			this.performOperation(machine, "F");
			this.performOperation(machine, "E");
			this.performOperation(machine, "D");
		}
	}

	private void performCompositeScriptForSwitchingOff(Machine machine) {
		printer.printMessageLevel1("Executing compositeScript (operator)");
		this.performOperation(machine, "C");
		this.performOperation(machine, "B");
		this.performOperation(machine, "A");
	}

	private void performOperation(Machine machine, String name) {
		printer.printMessageLevel2("Executing operation " + name + " (operator)");
		machine.execute(name);
	}
}
