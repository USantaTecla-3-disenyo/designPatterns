package usantatecla.Interpreter.interpreterFine;

public class OperationScript extends Script {

	private String name;

	public OperationScript(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public void execute(Machine machine) {
		printer.printMessageLevel2("Executing operation " + this.name + " (operationScript)");
		machine.execute(this.name);
	}
}
