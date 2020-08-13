package usantatecla.Visitor.visitorWrong;

public class Head implements BodyPart {

	
	public void evaluate() {
		printer.printMessageLevel3("Evaluating head (head)");	
	}

	
	public void diagnose() {
		printer.printMessageLevel3("Diagnosing head (head)");	
	}

	
	public void operate() {
		printer.printMessageLevel3("Operating head (head)");	
	}
}
