package usantatecla.Visitor.visitorWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("VISITOR FINE");
		
		Hospital hospital = new Hospital();
		Patient patient = new Patient();

		printer.printSubTitle("HOSPITAL RECEIVING A PATIENT WITH HEAD INJURY");
		patient.add(new Head());
		hospital.attendPatient(patient);
		
		printer.printSubTitle("HOSPITAL RECEIVING A PATIENT WITH HEAD AND TRUNK INJURY");
		patient.add(new Trunk());
		hospital.attendPatient(patient);
		
		printer.printSubTitle("HOSPITAL RECEIVING A PATIENT WITH MULTIPLE INJURY");
		patient.add(new Limb());
		hospital.attendPatient(patient);
	}
}