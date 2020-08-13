package usantatecla.Flyweight.flyWeightFine;

import java.util.ArrayList;

public class CardFactory {

	private ArrayList<Card> cards;

	public CardFactory() {
		this.cards = new ArrayList<Card>();
	}

	public Card getCard(Suit suit, Value value) {
		Card requestedCard = new StandardCard(suit, value);
		boolean cardFound = this.cards.contains(requestedCard);
		if (!cardFound)
			this.cards.add(requestedCard);
		int cardPosition = this.cards.indexOf(requestedCard);
		return this.cards.get(cardPosition);
	}
}
