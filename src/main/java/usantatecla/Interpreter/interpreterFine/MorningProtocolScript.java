package usantatecla.Interpreter.interpreterFine;

public class MorningProtocolScript extends CompositeScript {

	private static final int SUBROUTINE_DE_TIMES = 2;
	private static final int OPERATION_F_TIMES = 3;

	public MorningProtocolScript() {
		super();

		CompositeScript compositeScriptForStarting = new CompositeScript();
		compositeScriptForStarting.addScript(new OperationScript("A"));
		compositeScriptForStarting.addScript(new OperationScript("B"));
		compositeScriptForStarting.addScript(new OperationScript("C"));
		this.addScript(compositeScriptForStarting);

		CompositeScript compositeScriptForTasksDE = new CompositeScript();
		compositeScriptForTasksDE.addScript(new OperationScript("D"));
		compositeScriptForTasksDE.addScript(new OperationScript("E"));
		IterativeScript iterativeScriptForTasksDE = new IterativeScript(compositeScriptForTasksDE, SUBROUTINE_DE_TIMES);
		this.addScript(iterativeScriptForTasksDE);

		OperationScript operationScriptF = new OperationScript("F");
		IterativeScript iterativeScriptOperationScriptF = new IterativeScript(operationScriptF, OPERATION_F_TIMES);
		this.addScript(iterativeScriptOperationScriptF);
	}
}
