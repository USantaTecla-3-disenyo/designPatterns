package usantatecla.Visitor.visitorWrong;

import usantatecla.Utils.utils.Printer;

public class SuperStaff {

	Printer printer = Printer.getInstance();

	public void evaluateBodyPart(BodyPart bodyPart) {
		printer.printMessageLevel3("Evaluating " + bodyPart.getClass().getSimpleName() + "(superStaff)");		
	}

	public void diagnoseBodyPart(BodyPart bodyPart) {
		printer.printMessageLevel3("Diagnosing " + bodyPart.getClass().getSimpleName() + "(superStaff)");		
	}

	public void operateBodyPart(BodyPart bodyPart) {
		printer.printMessageLevel3("Operating " + bodyPart.getClass().getSimpleName() + "(superStaff)");		
	}
}
