package usantatecla.Singleton.singletonFineMultiple;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();

		printer.printTitle("SINGLETON FINE");
		
		SecurityGuard securityGuard = SecurityGuard.getInstance();
		School school = new School();
		printer.printMessageLevel1(school.toString());
		
		printer.printSubTitle("SCHOOL STARTING ACADEMIC YEAR");

		securityGuard.openSchool();
		school.startAcademicYear();
	}
}
