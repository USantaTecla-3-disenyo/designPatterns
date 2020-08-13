package usantatecla.Builder.builderWrong;

import java.util.Random;

import usantatecla.Utils.utils.Printer;

public class Person {

	private Printer printer = Printer.getInstance();

	enum Dish {
		BASIC, GOURMET
	};

	private int generateRandomDish() {
		Random randomDish = new Random();
		return randomDish.nextInt(Dish.values().length);
	}

	public void eat() {
		int dishToEat = this.generateRandomDish();

		if (dishToEat == Dish.BASIC.ordinal()) {
			Salad salad = this.prepareSalad();
			Chicken chicken = this.prepareChicken();
			Custard custard = this.prepareCustard();
			printer.printMessageLevel1("Eating menu (person)");
			printer.printMessageLevel2(salad.toString());
			printer.printMessageLevel2(chicken.toString());
			printer.printMessageLevel2(custard.toString());
		} else if (dishToEat == Dish.GOURMET.ordinal()) {
			Oyster oyster = this.prepareOyster();
			Sirloin sirloin = this.prepareSirloin();
			Souffle souffle = this.prepareSouffle();
			printer.printMessageLevel1("Eating menu (person)");
			printer.printMessageLevel2(oyster.toString());
			printer.printMessageLevel2(sirloin.toString());
			printer.printMessageLevel2(souffle.toString());
		}
	}

	private Salad prepareSalad() {
		printer.printMessageLevel1("Preparing salad (person)");
		return new Salad();
	}

	private Chicken prepareChicken() {
		printer.printMessageLevel1("Preparing chicken (person)");
		return new Chicken();
	}

	private Custard prepareCustard() {
		printer.printMessageLevel1("Preparing custard (person)");
		return new Custard();
	}

	private Oyster prepareOyster() {
		printer.printMessageLevel1("Preparing oyster (person)");
		return new Oyster();
	}

	private Sirloin prepareSirloin() {
		printer.printMessageLevel1("Preparing sirloin (person)");
		return new Sirloin();
	}

	private Souffle prepareSouffle() {
		printer.printMessageLevel1("Preparing souffle (person)");
		return new Souffle();
	}
}
