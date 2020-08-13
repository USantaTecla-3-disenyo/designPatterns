package usantatecla.Singleton.singletonFineMultiple;

public class Menu {

	private Option[] options;

	public Menu() {
		this.options = new Option[3];
		this.options[0] = new Option("Option 1");
		this.options[1] = new Option("Option 2");
		this.options[2] = new Option("Option 3");
	}

	public void print() {
		for (Option option : this.options) {
			option.print();
		}
	}
}
