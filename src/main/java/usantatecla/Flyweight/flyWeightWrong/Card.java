package usantatecla.Flyweight.flyWeightWrong;

public abstract class Card {

	protected boolean facedUp;

	public abstract Suit getSuit();

	public abstract Value getValue();

	public boolean isFacedUp() {
		return this.facedUp;
	}

	public void flip() {
		this.facedUp = !this.facedUp;
	}
}