package usantatecla.AbstractFactory.abstractFactoryFine;

import usantatecla.Utils.utils.Printer;

public class Surgeon {

	private Printer printer = Printer.getInstance();

	public void operate(Intrumentalist instrumentalist) {
		CuttingTool cuttingTool = instrumentalist.createCuttingTool();
		DryingTool dryingTool = instrumentalist.createDryingTool();

		printer.printMessageLevel1("Operate with created tools (surgeon)");
		cuttingTool.cut();
		cuttingTool.getAttribute();
		dryingTool.dry();
		dryingTool.getAttribute();
	}
}