package usantatecla.AbstractFactory.abstractFactoryFine;

public abstract class DryingTool {
	private String attribute;

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public abstract void dry();
}