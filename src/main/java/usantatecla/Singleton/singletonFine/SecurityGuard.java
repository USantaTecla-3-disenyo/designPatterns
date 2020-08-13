package usantatecla.Singleton.singletonFine;

import usantatecla.Utils.utils.Printer;

public class SecurityGuard {

	private Printer printer = Printer.getInstance();

	private static SecurityGuard securityGuard;
	
	private String schoolKeys;

	public static SecurityGuard getInstance() {
		if (securityGuard == null) {
			securityGuard = new SecurityGuard();
		}
		return securityGuard;
	}

	private SecurityGuard() {
		printer.printMessageLevel1("Creating security guard");
	}
	
	public void openSchool() {
		printer.printMessageLevel1("Opening school (" + this.toString() + ")");
	}

	public void openClassRoom() {
		printer.printMessageLevel2("Opening classroom (" + this.toString() + ")");
	}
	
	public void closeClassRoom() {
		printer.printMessageLevel2("Closing classroom (" + this.toString() + ")");
	}

	public String provideSchoolKeys() {
		printer.printMessageLevel2("Providing keys (" + this.toString() + ")");
		return this.schoolKeys;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
