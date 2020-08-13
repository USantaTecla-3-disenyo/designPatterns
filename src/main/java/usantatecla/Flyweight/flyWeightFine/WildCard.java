package usantatecla.Flyweight.flyWeightFine;

import java.util.Objects;

public class WildCard extends Card {

	private StandardCard standardCard;

	public WildCard() {
		this.standardCard = null;
	}

	public StandardCard getCard() {
		return this.standardCard;
	}

	public void setCard(StandardCard card) {
		this.standardCard = card;
	}

	public Suit getSuit() {
		if (this.standardCard != null)
			return this.standardCard.getSuit();
		return null;
	}

	public Value getValue() {
		if (this.standardCard != null)
			return this.standardCard.getValue();
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(standardCard);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof WildCard)) {
			return false;
		}
		WildCard other = (WildCard) obj;
		return Objects.equals(standardCard, other.standardCard);
	}

	@Override
	public String toString() {
		return "WildCard [] (" + this.hashCode() + ")\n" + this.standardCard.toString();
	}
}
