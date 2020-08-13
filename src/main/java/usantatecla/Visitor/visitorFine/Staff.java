package usantatecla.Visitor.visitorFine;

import usantatecla.Utils.utils.Printer;

public interface Staff {
	
	public Printer printer = Printer.getInstance();
	
	public void visitHead(Head head);
	public void visitTrunk(Trunk trunk);
	public void visitLimb(Limb limb);

}
