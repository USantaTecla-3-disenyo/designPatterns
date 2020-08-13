package usantatecla.Flyweight.flyWeightFine;

public enum Value {
	AS, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

	public int getValue() {
		return this.ordinal() + 1;
	}
}
