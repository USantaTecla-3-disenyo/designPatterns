package usantatecla.Builder.builderFine;

import usantatecla.Utils.utils.Printer;

public class Person {

	private Printer printer = Printer.getInstance();

	public void eat(Chef chef) {
		Dish starter = chef.prepareStarter();
		Dish mainCourse = chef.prepareMainCourse();
		Dish dessert = chef.prepareDessert();
		printer.printMessageLevel1("Eating menu (person)");
		printer.printMessageLevel2(starter.toString());
		printer.printMessageLevel2(mainCourse.toString());
		printer.printMessageLevel2(dessert.toString());
	}
}
