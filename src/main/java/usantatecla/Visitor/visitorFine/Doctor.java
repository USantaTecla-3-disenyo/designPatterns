package usantatecla.Visitor.visitorFine;

public class Doctor implements Staff {

	
	public void visitHead(Head head) {
		printer.printMessageLevel3("Diagnosing head (doctor)");	
	}

	
	public void visitTrunk(Trunk trunk) {
		printer.printMessageLevel3("Diagnosing trunk (doctor)");	
	}

	
	public void visitLimb(Limb limb) {
		printer.printMessageLevel3("Diagnosing limb (doctor)");	
	}
}
