package usantatecla.Visitor.visitorFine;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("VISITOR FINE");
		
		Hospital hospital = new Hospital();
		Patient patient = new Patient();

		printer.printSubTitle("HOSPITAL TREATING A PATIENT WITH HEAD INJURY");
		patient.add(new Head());
		hospital.treatPatient(patient);
		
		printer.printSubTitle("HOSPITAL TREATING A PATIENT WITH HEAD AND TRUNK INJURY");
		patient.add(new Trunk());
		hospital.treatPatient(patient);
		
		printer.printSubTitle("HOSPITAL TREATING A PATIENT WITH MULTIPLE INJURY");
		patient.add(new Limb());
		hospital.treatPatient(patient);
	}
}