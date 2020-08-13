package usantatecla.Interpreter.interpreterFine;

public class EveningProtocolScript extends CompositeScript {

	private static final int SUBROUTINE_FED_TIMES = 2;

	public EveningProtocolScript() {
		super();

		OperationScript operationScriptD = new OperationScript("D");
		this.addScript(operationScriptD);

		CompositeScript compositeScriptForTasksFED = new CompositeScript();
		compositeScriptForTasksFED.addScript(new OperationScript("F"));
		compositeScriptForTasksFED.addScript(new OperationScript("E"));
		compositeScriptForTasksFED.addScript(new OperationScript("D"));
		IterativeScript iterativeScriptForTasksFED = new IterativeScript(compositeScriptForTasksFED,
				SUBROUTINE_FED_TIMES);
		this.addScript(iterativeScriptForTasksFED);

		CompositeScript compositeScriptForSwitchingOff = new CompositeScript();
		compositeScriptForSwitchingOff.addScript(new OperationScript("C"));
		compositeScriptForSwitchingOff.addScript(new OperationScript("B"));
		compositeScriptForSwitchingOff.addScript(new OperationScript("A"));
		this.addScript(compositeScriptForSwitchingOff);
	}
}
