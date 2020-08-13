package usantatecla.Singleton.singletonWrong;

public class Menu {

	private Option[] options;

	public Menu(Printer printer) {
		this.options = new Option[3];
		this.options[0] = new Option("Option 1", printer);
		this.options[1] = new Option("Option 2", printer);
		this.options[2] = new Option("Option 3", printer);
	}

	public void print() {
		for (Option option : this.options) {
			option.print();
		}
	}
}
