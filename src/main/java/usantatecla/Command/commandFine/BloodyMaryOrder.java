package usantatecla.Command.commandFine;

public class BloodyMaryOrder extends BarmanOrder {

	public BloodyMaryOrder(Barman[] barmen) {
		super(barmen);
	}

	@Override
	public void serve() {
		printer.printMessageLevel2("Requesting an order (bloodyMary)");
		this.getBarman().prepareBloodyMary();
	}
}
