package usantatecla.Command.commandFine;

public class Restaurant {

	static final int MAX_NUMBER_EMPLOYEES_PER_TYPE = 3;

	private Waiter waiter;
	private Chef[] chefs;
	private Barman[] barmen;

	public Restaurant(Waiter waiter, Chef[] chefs, Barman[] barmen) {
		this.waiter = waiter;
		this.chefs = chefs;
		this.barmen = barmen;
	}

	public void attendToCustomersAtLunchTime() {
		this.waiter.serve(new VermouthOrder(this.barmen));
		this.waiter.serve(new DishOfTheDayOrder(this.chefs));
		this.chefs[MAX_NUMBER_EMPLOYEES_PER_TYPE - 1].cleanKitchen();
	}

	public void attendToCustomersAtDinnerTime() {
		this.waiter.serve(new CombinationPlateOrder(this.chefs));
		this.waiter.serve(new BloodyMaryOrder(this.barmen));
		this.barmen[MAX_NUMBER_EMPLOYEES_PER_TYPE - 1].cleanBar();
	}
}
