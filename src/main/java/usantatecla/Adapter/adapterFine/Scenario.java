package usantatecla.Adapter.adapterFine;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("ADAPTER FINE");

		PowerPointC powerPointC = new PowerPointC();
		HairdryerC hairdryerC = new HairdryerC();
		ShaverC shaverC = new ShaverC();
		PowerPointF powerPointF = new PowerPointF();

		printer.printSubTitle("USING APPLIANCES TYPE C IN A POWERPOINT TYPE C DIRECTLY");
		hairdryerC.plug(powerPointC);
		shaverC.plug(powerPointC);

		AdapterPowerPlugF adapter = new AdapterPowerPlugF();

		printer.printSubTitle("USING APPLIANCES TYPE C IN A POWERPOINT TYPE F WITH ADAPTER");
		adapter.setPowerPlugC(hairdryerC.getPowerPlugC());
		adapter.plug(powerPointF);
		adapter.setPowerPlugC(shaverC.getPowerPlugC());
		adapter.plug(powerPointF);
	}
}