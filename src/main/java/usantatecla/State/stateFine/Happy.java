package usantatecla.State.stateFine;

public class Happy extends Mood{
	
	@Override
	protected void eat() {
		printer.printMessageLevel1("Eating in happy mood");
		printer.printMessageLevel2("Prepare some healthy food");
		printer.printMessageLevel2("Eat");
	}
	
	@Override
	protected void dance() {
		printer.printMessageLevel1("Dancing in happy mood");
		printer.printMessageLevel2("Put some lively music");
		printer.printMessageLevel2("Dance");
	}

	@Override
	protected void work() {
		printer.printMessageLevel1("Working in happy mood");
		printer.printMessageLevel2("Go to work with a smile");
		printer.printMessageLevel2("Work");
	}
}
