package usantatecla.Singleton.singletonFineMultiple;

public class PrivateSecurityGuard extends SecurityGuard {

	@Override
	public void openSchool() {
		printer.printMessageLevel1("Opening school with remote control (" + this.toString() + ")");
	}

	@Override
	public void openClassRoom() {
		printer.printMessageLevel2("Opening classroom with remote control (" + this.toString() + ")");
	}
	
	@Override
	public void closeClassRoom() {
		printer.printMessageLevel2("Closing classroom with remote control (" + this.toString() + ")");
	}

	@Override
	public String provideSchoolKeys() {
		printer.printMessageLevel2("Providing remote control key (" + this.toString() + ")");
		return this.schoolKeys;
	}
}
