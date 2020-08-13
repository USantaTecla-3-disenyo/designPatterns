package usantatecla.State.stateFine;

public class Sad extends Mood{
	
	@Override
	protected void eat() {
		printer.printMessageLevel1("Eating in sad mood");
		printer.printMessageLevel2("Prepare some fast food");
		printer.printMessageLevel2("Eat");
	}
	
	@Override
	protected void dance() {
		printer.printMessageLevel1("Dancing in sad mood");
		printer.printMessageLevel2("Put some apathetic music");
		printer.printMessageLevel2("Dance");
	}

	@Override
	protected void work() {
		printer.printMessageLevel1("Working in sad mood");
		printer.printMessageLevel2("Go to work with sorrow");
		printer.printMessageLevel2("Work");
	}
}
