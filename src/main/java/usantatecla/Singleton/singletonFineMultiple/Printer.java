package usantatecla.Singleton.singletonFineMultiple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Printer {

	private static Printer printer;

	public static Printer getInstance() {
		if (printer == null) {
			String name = Printer.getSingletonConfigure();
			try {
				printer = (Printer) (Class.forName("singletonFineMultiple." + name).newInstance());
			} catch (ClassNotFoundException e) {
				assert false;
			} catch (InstantiationException e) {
				assert false;
			} catch (IllegalAccessException e) {
				assert false;
			}
		}
		return printer;
	}

	protected Printer() {
	}

	private static String getSingletonConfigure() {
		BufferedReader in = null;
		String line = "";
		try {
			in = new BufferedReader(new FileReader(
					"C:\\Users\\emartej\\OneDrive - Ericsson AB\\Documents\\Master_Proyecto\\master-emartej\\Patterns\\Singleton\\SingletonFineMultiple\\singletonConfigure"));
			line = in.readLine().substring(10);
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

	public void printTitle(String title) {
		System.out.println();
		System.out.println("*************************************************************");
		System.out.println(title.toUpperCase() + " EXAMPLE");
		System.out.println("*************************************************************");
	}

	public void printSubTitle(String subtitle) {
		System.out.println();
		System.out.println();
		System.out.println(subtitle);
		System.out.println("-------------------------------------------------------------");
		System.out.println();
	}

	public void printMessageLevel1(String message) {
		System.out.println(message);
	}

	public void printMessageLevel2(String message) {
		System.out.println("   " + message);
	}

	public void printMessageLevel3(String message) {
		System.out.println("      " + message);
	}

	public void printMessageLevel4(String message) {
		System.out.println("         " + message);
	}
}
