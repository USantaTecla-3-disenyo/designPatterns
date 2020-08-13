package usantatecla.Visitor.visitorFine;

import java.util.ArrayList;

import usantatecla.Utils.utils.Printer;

public class Patient {
	
	Printer printer = Printer.getInstance();
	
	private ArrayList<BodyPart> bodyParts;
	
	public Patient() {
		this.bodyParts = new ArrayList<BodyPart>();
	}
	
	public void add(BodyPart bodyPart){
		this.bodyParts.add(bodyPart);
	}
	
	public void accept(Staff staff) {
		printer.printMessageLevel2("Accepting the visit of " + staff.getClass().getSimpleName() + " (patient)");
		for(BodyPart bodyPart : this.bodyParts){
			bodyPart.accept(staff);
		}
	}
}
