package usantatecla.Singleton.singletonFineMultiple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import usantatecla.Utils.utils.Printer;

public class SecurityGuard {

	protected Printer printer = Printer.getInstance();

	private static SecurityGuard securityGuard;
	
	protected String schoolKeys;

	public static SecurityGuard getInstance() {
		if (securityGuard == null) {
			String name = SecurityGuard.getSingletonConfigure();
			try {
				securityGuard = (SecurityGuard) (Class
						.forName("singletonFineMultiple." + name).newInstance());
			} catch (ClassNotFoundException e) {
				assert false;
			} catch (InstantiationException e) {
				assert false;
			} catch (IllegalAccessException e) {
				assert false;
			}
		}
		return securityGuard;
	}

	protected SecurityGuard() {
		printer.printMessageLevel1("Creating " + this.toString());
	}
	
	private static String getSingletonConfigure() {
		BufferedReader in = null;
		String line = "";
		try {
			in = new BufferedReader(new FileReader("C:\\Users\\emartej\\OneDrive - Ericsson AB\\Documents\\Master_Proyecto\\master-emartej\\Patterns\\Singleton\\singletonFineMultiple\\singletonConfigure"));
			line = in.readLine().substring(16);
		} catch (IOException ex) {
			System.out.println("IOException while reading: " + ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOException while closing: " + ex.getMessage());
				}
			}
		}
		return line;
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
