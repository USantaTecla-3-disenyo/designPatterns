package usantatecla.Command.commandWrong;

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
		this.waiter.serveVermouth();
		this.waiter.serveDishOfTheDay();
		this.chefs[MAX_NUMBER_EMPLOYEES_PER_TYPE - 1].cleanKitchen();
	}

	public void attendToCustomersAtDinnerTime() {
		this.waiter.serveCombinationPlate();
		this.waiter.serveBloodyMary();
		this.barmen[MAX_NUMBER_EMPLOYEES_PER_TYPE - 1].cleanBar();
	}
}
