package usantatecla.Visitor.visitorFine;

public class Head implements BodyPart {

	
	public void accept(Staff staff) {
		staff.visitHead(this);
	}
}
