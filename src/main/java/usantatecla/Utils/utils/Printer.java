package usantatecla.Utils.utils;

public class Printer {

	private static Printer printer;

	public static Printer getInstance() {
		if (printer == null) {
			printer = new Printer();
		}
		return printer;
	}

	private Printer() {
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
