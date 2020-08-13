package usantatecla.Command.commandFine;

public abstract class ChefOrder extends Order {

	protected Chef[] chefs;

	protected ChefOrder(Chef[] chefs) {
		this.chefs = chefs;
	}

	protected Chef getChef() {
		return this.chefs[this.generateRandom(this.chefs.length)];
	}
}
