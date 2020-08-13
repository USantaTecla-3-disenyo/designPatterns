package usantatecla.Visitor.visitorWrong;

import usantatecla.Utils.utils.Printer;

public class Hospital {
	
	private Printer printer = Printer.getInstance();

	public void attendPatient(Patient patient) {
		printer.printMessageLevel1("Attending patient (hospital)");
		patient.evaluate();
		patient.diagnose();
		patient.operate();
	}
}
