package usantatecla.Singleton.singletonFineMultiple;

public class PublicSecurityGuard extends SecurityGuard {

	@Override
	public void openSchool() {
		printer.printMessageLevel1("Opening school with standard key (" + this.toString() + ")");
	}

	@Override
	public void openClassRoom() {
		printer.printMessageLevel2("Opening classroom with standard key (" + this.toString() + ")");
	}
	
	@Override
	public void closeClassRoom() {
		printer.printMessageLevel2("Closing classroom with standard key (" + this.toString() + ")");
	}

	@Override
	public String provideSchoolKeys() {
		printer.printMessageLevel2("Providing standard key (" + this.toString() + ")");
		return this.schoolKeys;
	}
}
