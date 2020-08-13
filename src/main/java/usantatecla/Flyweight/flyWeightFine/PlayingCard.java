package usantatecla.Flyweight.flyWeightFine;

import java.util.Objects;

public class PlayingCard {

	private Card card;
	private boolean facedUp;

	public PlayingCard(Card card, boolean facedUp) {
		this.card = card;
		this.facedUp = false;
	}

	public Card getCard() {
		return this.card;
	}

	public boolean isFacedUp() {
		return this.facedUp;
	}

	public void flip() {
		this.facedUp = !this.facedUp;
	}

	@Override
	public String toString() {
		return "PlayingCard [facedUp=" + this.facedUp + "] (" + this.hashCode() + ")\n" + this.card.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(card, facedUp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof PlayingCard)) {
			return false;
		}
		PlayingCard other = (PlayingCard) obj;
		return Objects.equals(card, other.card) && facedUp == other.facedUp;
	}
}
