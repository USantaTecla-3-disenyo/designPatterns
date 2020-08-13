package usantatecla.Visitor.visitorFine;

public class TriageNurse implements Staff {

	
	public void visitHead(Head head) {
		printer.printMessageLevel3("Evaluating head (triageNurse)");	
	}

	
	public void visitTrunk(Trunk trunk) {
		printer.printMessageLevel3("Evaluating trunk (triageNurse)");	
	}

	
	public void visitLimb(Limb limb) {
		printer.printMessageLevel3("Evaluating limb (triageNurse)");	
	}
}
