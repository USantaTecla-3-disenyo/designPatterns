package usantatecla.Command.commandFine;

public class VermouthOrder extends BarmanOrder {

	public VermouthOrder(Barman[] barmen) {
		super(barmen);
	}

	@Override
	public void serve() {
		printer.printMessageLevel2("Requesting an order (vermouth)");
		this.getBarman().prepareVermouth();
	}
}
