package usantatecla.Command.commandWrong;

import usantatecla.Utils.utils.Printer;

public class Barman {

	private Printer printer = Printer.getInstance();

	private String name;

	public Barman(String name) {
		this.name = name;
	}

	public void prepareVermouth() {
		printer.printMessageLevel3("Preparing vermouth (" + this.name + ")");
	}

	public void prepareBloodyMary() {
		printer.printMessageLevel3("Preparing Bloody Mary (" + this.name + ")");
	}

	public void cleanBar() {
		printer.printMessageLevel1("Cleaning bar (" + this.name + ")");
	}
}
