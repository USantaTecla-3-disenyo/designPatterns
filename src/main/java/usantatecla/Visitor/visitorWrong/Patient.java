package usantatecla.Visitor.visitorWrong;

import java.util.ArrayList;

import usantatecla.Utils.utils.Printer;

public class Patient {

	private Printer printer = Printer.getInstance();

	private ArrayList<BodyPart> bodyParts;
	
	public Patient() {
		this.bodyParts = new ArrayList<BodyPart>();
	}
	
	public void add(BodyPart bodyPart){
		this.bodyParts.add(bodyPart);
	}
	
	public void evaluate() {
		printer.printMessageLevel2("Evaluating oneself (patient)");
		for(BodyPart bodyPart : this.bodyParts) {
			bodyPart.evaluate();
		}
	}

	public void diagnose() {
		printer.printMessageLevel2("Diagnosing oneself (patient)");
		for(BodyPart bodyPart : this.bodyParts) {
			bodyPart.diagnose();
		}
	}
	
	public void operate() {
		printer.printMessageLevel2("Operating oneself (patient)");
		for(BodyPart bodyPart : this.bodyParts) {
			bodyPart.operate();
		}
	}
}
