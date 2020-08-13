package usantatecla.State.stateWrong;

import usantatecla.Utils.utils.Printer;

public class Person {

	private Printer printer = Printer.getInstance();
	
	enum AvailableMood {
		HAPPY, SAD;
	}
	
	private AvailableMood mood;
	
	public Person() {
		this.mood = AvailableMood.HAPPY;
		printer.printMessageLevel1("Creating person with " + this.mood + " mood");
	}

	public void eat() {
		if (this.mood == AvailableMood.HAPPY) {
			this.eatHappy();
		} else if (this.mood == AvailableMood.SAD) {
			this.eatSad();
		}
		printer.printMessageLevel3("Keeping state");	
	}
	
	private void eatHappy() {
		printer.printMessageLevel1("Eating in happy mood");
		printer.printMessageLevel2("Prepare some healthy food");
		printer.printMessageLevel2("Eat");
	}
	
	private void eatSad() {
		printer.printMessageLevel1("Eating in sad mood");
		printer.printMessageLevel2("Prepare some fast food");
		printer.printMessageLevel2("Eat");
	}
	
	public void dance() {
		if (this.mood == AvailableMood.HAPPY) {
			this.danceHappy();
		} else if (this.mood == AvailableMood.SAD) {
			this.danceSad();
			this.mood = AvailableMood.HAPPY;
		}
		printer.printMessageLevel3("Setting state to Happy");
	}
	
	private void danceHappy() {
		printer.printMessageLevel1("Dancing in happy mood");
		printer.printMessageLevel2("Put some lively music");
		printer.printMessageLevel2("Dance");
	}
	
	private void danceSad() {
		printer.printMessageLevel1("Dancing in sad mood");
		printer.printMessageLevel2("Put some apathetic music");
		printer.printMessageLevel2("Dance");
	}
	
	public void work() {
		if (this.mood == AvailableMood.HAPPY) {
			this.workHappy();
			this.mood = AvailableMood.SAD;
		} else if (this.mood == AvailableMood.SAD) {
			this.workSad();
		}
		printer.printMessageLevel3("Setting state to Sad");
	}
	
	private void workHappy() {
		printer.printMessageLevel1("Working in happy mood");
		printer.printMessageLevel2("Go to work with a smile");
		printer.printMessageLevel2("Work");
	}

	private void workSad() {
		printer.printMessageLevel1("Working in sad mood");
		printer.printMessageLevel2("Go to work with sorrow");
		printer.printMessageLevel2("Work");
	}
}
