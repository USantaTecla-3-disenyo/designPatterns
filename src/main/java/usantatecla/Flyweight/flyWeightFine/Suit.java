package usantatecla.Flyweight.flyWeightFine;

public enum Suit {

	HEARTS('H'), CLOVERS('C'), DIAMONDS('D'), PIKES('P');

	private final char initial;

	Suit(char initial) {
		this.initial = initial;
	}

	public static char[] getInitials() {
		char[] initials = new char[Suit.values().length];
		for (Suit suit : Suit.values()) {
			initials[suit.ordinal()] = suit.initial;
		}
		return initials;
	}

	public static Suit find(char initial) {
		for (Suit suit : Suit.values())
			if (initial == suit.initial) {
				return suit;
			}
		return null;
	}
}
