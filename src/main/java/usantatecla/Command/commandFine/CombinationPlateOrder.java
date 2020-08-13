package usantatecla.Command.commandFine;

public class CombinationPlateOrder extends ChefOrder {

	public CombinationPlateOrder(Chef[] chefs) {
		super(chefs);
	}

	@Override
	public void serve() {
		printer.printMessageLevel2("Requesting an order (combinationPlate)");
		this.getChef().prepareSalad();
		this.getChef().prepareEggs();
		this.getChef().prepareFries();
	}

}
