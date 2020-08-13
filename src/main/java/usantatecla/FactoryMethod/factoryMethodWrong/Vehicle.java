package usantatecla.FactoryMethod.factoryMethodWrong;

public abstract class Vehicle {
	private String attribute;

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public abstract void ride();
}