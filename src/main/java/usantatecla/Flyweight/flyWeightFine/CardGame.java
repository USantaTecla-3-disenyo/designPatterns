package usantatecla.Flyweight.flyWeightFine;

public class CardGame {

	private CardFactory cardFactory;

	public CardGame(CardFactory cardFactory) {
		this.cardFactory = cardFactory;
	}

	public PlayingCard getCard(Suit suit, Value value) {
		Card card = this.cardFactory.getCard(suit, value);
		return new PlayingCard(card, false);
	}

	public PlayingCard getCard() {
		return new PlayingCard(new WildCard(), false);
	}

	public void setCard(PlayingCard wildCard, PlayingCard standardCard) {
		WildCard w = (WildCard) wildCard.getCard();
		w.setCard((StandardCard) standardCard.getCard());
	}
}
