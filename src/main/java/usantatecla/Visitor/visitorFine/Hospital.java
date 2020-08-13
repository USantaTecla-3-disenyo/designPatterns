package usantatecla.Visitor.visitorFine;

import usantatecla.Utils.utils.Printer;

public class Hospital {
	
	Printer printer = Printer.getInstance();

	public void treatPatient(Patient patient) {
		printer.printMessageLevel1("Treating patient (hospital)");
		patient.accept(new TriageNurse());
		patient.accept(new Doctor());
		patient.accept(new Surgeon());
	}
}
