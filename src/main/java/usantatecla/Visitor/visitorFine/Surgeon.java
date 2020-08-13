package usantatecla.Visitor.visitorFine;

public class Surgeon implements Staff {

	
	public void visitHead(Head head) {
		printer.printMessageLevel3("Operating head (surgeon)");	
	}

	
	public void visitTrunk(Trunk trunk) {
		printer.printMessageLevel3("Operating trunk (surgeon)");	
	}

	
	public void visitLimb(Limb limb) {
		printer.printMessageLevel3("Operating limb (surgeon)");	
	}
}
