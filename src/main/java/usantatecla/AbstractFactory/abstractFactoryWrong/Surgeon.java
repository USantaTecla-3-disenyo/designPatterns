package usantatecla.AbstractFactory.abstractFactoryWrong;

import java.util.Random;

import usantatecla.Utils.utils.Printer;

public class Surgeon {

	private Printer printer = Printer.getInstance();

	enum Location {
		OPERATING_ROOM, JUNGLE
	};

	private int generateRandomLocation() {
		Random randomLocation = new Random();
		return randomLocation.nextInt(Location.values().length);
	}

	public void operate() {
		int surgeonLocation = this.generateRandomLocation();

		if (surgeonLocation == Location.OPERATING_ROOM.ordinal()) {
			this.operateInOperatingRoom();
		} else if (surgeonLocation == Location.JUNGLE.ordinal()) {
			this.operateInJungle();
		}
	}

	private void operateInOperatingRoom() {
		Scalpel cuttingTool = createCuttingToolScalpel();
		Compress dryingTool = createDryingToolCompress();

		printer.printMessageLevel1("Operate in operating room with created tools (surgeon)");
		cuttingTool.cut();
		cuttingTool.getAttribute();
		dryingTool.dry();
		dryingTool.getAttribute();
	}

	private void operateInJungle() {
		Knife cuttingTool = createCuttingToolKnife();
		Rag dryingTool = createDryingToolRag();

		printer.printMessageLevel1("Operate in jungle with created tools (surgeon)");
		cuttingTool.cut();
		cuttingTool.getAttribute();
		dryingTool.dry();
		dryingTool.getAttribute();
	}

	private Scalpel createCuttingToolScalpel() {
		printer.printMessageLevel1("Creating cuttingTool scalpel (surgeon)");
		return new Scalpel();
	}

	private Compress createDryingToolCompress() {
		printer.printMessageLevel1("Creating dryingTool compress (surgeon)");
		return new Compress();
	}

	private Knife createCuttingToolKnife() {
		printer.printMessageLevel1("Creating cuttingTool knife (surgeon)");
		return new Knife();
	}

	private Rag createDryingToolRag() {
		printer.printMessageLevel1("Creating dryingTool rag (surgeon)");
		return new Rag();
	}
}