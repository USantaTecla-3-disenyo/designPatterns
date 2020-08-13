package usantatecla.Visitor.visitorWrong;

public class Limb implements BodyPart {

	
	public void evaluate() {
		printer.printMessageLevel3("Evaluating limb (limb)");	
	}

	
	public void diagnose() {
		printer.printMessageLevel3("Diagnosing limb (limb)");	
	}

	
	public void operate() {
		printer.printMessageLevel3("Operating limb (limb)");	
	}
}
