package usantatecla.Visitor.visitorFine;

public class Limb implements BodyPart {

	
	public void accept(Staff staff) {
		staff.visitLimb(this);
	}
}
