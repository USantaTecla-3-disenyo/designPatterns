package usantatecla.Command.commandFine;

public class DishOfTheDayOrder extends ChefOrder {

	public DishOfTheDayOrder(Chef[] chefs) {
		super(chefs);
	}

	@Override
	public void serve() {
		printer.printMessageLevel2("Requesting an order (dishOfTheDay)");
		this.getChef().prepareSoup();
		this.getChef().prepareSteak();
		this.getChef().prepareFries();
	}
}
