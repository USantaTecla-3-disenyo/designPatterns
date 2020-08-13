package usantatecla.Flyweight.flyWeightWrong;

public class CardGame {

	public Card getCard(Suit suit, Value value) {
		return new StandardCard(suit, value);
	}

	public Card getCard() {
		return new WildCard();
	}

	public void setCard(Card wildCard, Card standardCard) {
		WildCard w = (WildCard) wildCard;
		w.setCard((StandardCard) standardCard);
	}
}
