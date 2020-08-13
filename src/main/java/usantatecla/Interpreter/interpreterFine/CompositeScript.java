package usantatecla.Interpreter.interpreterFine;

import java.util.ArrayList;

public class CompositeScript extends Script {

	private ArrayList<Script> scripts;

	public CompositeScript() {
		super();
		this.scripts = new ArrayList<Script>();
	}

	public void addScript(Script script) {
		if (!this.scripts.contains(script)) {
			this.scripts.add(script);
		}
	}

	@Override
	public void execute(Machine machine) {
		printer.printMessageLevel1("\nExecuting compositeScript (compositeScript)");
		for (Script script : this.scripts) {
			script.execute(machine);
		}
	}
}
