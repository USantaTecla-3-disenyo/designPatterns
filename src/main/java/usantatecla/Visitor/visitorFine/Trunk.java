package usantatecla.Visitor.visitorFine;

public class Trunk implements BodyPart {

	
	public void accept(Staff staff) {
		staff.visitTrunk(this);
	}
}
