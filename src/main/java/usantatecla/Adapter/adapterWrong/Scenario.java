package usantatecla.Adapter.adapterWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("ADAPTER WRONG");

		PowerPointC powerPointC = new PowerPointC();
		HairdryerC hairdryerC = new HairdryerC();
		ShaverC shaverC = new ShaverC();
		PowerPointF powerPointF = new PowerPointF();
		HairdryerF hairdryerF = new HairdryerF();
		ShaverF shaverF = new ShaverF();

		printer.printSubTitle("USING APPLIANCES TYPE C IN A POWERPOINT TYPE C DIRECTLY");
		hairdryerC.plug(powerPointC);
		shaverC.plug(powerPointC);

		printer.printSubTitle("USING APPLIANCES TYPE F IN A POWERPOINT TYPE F DIRECTLY");
		hairdryerF.plug(powerPointF);
		shaverF.plug(powerPointF);
	}
}