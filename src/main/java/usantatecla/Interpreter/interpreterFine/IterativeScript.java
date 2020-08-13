package usantatecla.Interpreter.interpreterFine;

public class IterativeScript extends Script {

	private Script script;
	private int times;

	public IterativeScript(Script script, int times) {
		super();
		this.script = script;
		this.times = times;
	}

	@Override
	public void execute(Machine machine) {
		for (int times = 0; times < this.times; times++) {
			printer.printMessageLevel2("\nExecuting iterativeScript (" + (times + 1) + " times out of " + this.times
					+ ") (iterativeScript)");
			this.script.execute(machine);
		}
	}
}
