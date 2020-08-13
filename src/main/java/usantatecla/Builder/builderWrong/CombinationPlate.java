package usantatecla.Builder.builderWrong;

import usantatecla.Utils.utils.Printer;

public class CombinationPlate {

	private Printer printer = Printer.getInstance();

	private Salad salad;
	private Custard egg;
	private Chicken chicken;

	public void addSalad(Salad salad) {
		this.salad = salad;
		printer.printMessageLevel2("Adding salad to combination plate");
	}

	public void addEgg(Custard egg) {
		this.egg = egg;
		printer.printMessageLevel2("Adding egg to combination plate");
	}

	public void addChicken(Chicken chicken) {
		this.chicken = chicken;
		printer.printMessageLevel2("Adding chicken to combination plate");
	}

	@Override
	public String toString() {
		return "CombinationPlate [salad=" + this.salad + ", egg=" + this.egg + ", chicken=" + this.chicken + "]";
	}
}
