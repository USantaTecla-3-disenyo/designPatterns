package usantatecla.AbstractFactory.abstractFactoryWrong;

public abstract class CuttingTool {
	private String attribute;

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public abstract void cut();
}