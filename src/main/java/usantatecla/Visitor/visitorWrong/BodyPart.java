package usantatecla.Visitor.visitorWrong;

import usantatecla.Utils.utils.Printer;

public interface BodyPart {
	
	public Printer printer = Printer.getInstance();

	public void evaluate();
	public void diagnose();
	public void operate();

}
