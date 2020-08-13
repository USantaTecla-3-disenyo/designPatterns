package usantatecla.Flyweight.flyWeightWrong;

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

	public boolean isFacedUp() {
		if (this.standardCard != null)
			return this.standardCard.isFacedUp();
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(facedUp, standardCard);
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
		return facedUp == other.facedUp && Objects.equals(standardCard, other.standardCard);
	}

	@Override
	public String toString() {
		return "WildCard [facedUp: " + this.facedUp + "] (" + this.hashCode() + ")\n" + this.standardCard.toString();
	}
}
