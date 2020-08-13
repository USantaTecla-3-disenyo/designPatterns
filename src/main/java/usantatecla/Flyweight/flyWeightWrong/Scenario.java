package usantatecla.Flyweight.flyWeightWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("FLYWEIGHT WRONG");

		printer.printSubTitle("PLAYING FIRST GAME CARD");

		CardGame cardGame1 = new CardGame();

		Card playingCard1a = cardGame1.getCard(Suit.HEARTS, Value.SEVEN);
		playingCard1a.flip();
		printer.printMessageLevel1(playingCard1a.toString());

		Card playingCard1b = cardGame1.getCard(Suit.PIKES, Value.THREE);
		playingCard1b.flip();
		printer.printMessageLevel1(playingCard1b.toString());

		Card playingCard1c = cardGame1.getCard();
		cardGame1.setCard(playingCard1c, cardGame1.getCard(Suit.HEARTS, Value.SEVEN));
		playingCard1c.flip();
		printer.printMessageLevel1(playingCard1c.toString());

		printer.printSubTitle("PLAYING SECOND GAME CARD");

		CardGame cardGame2 = new CardGame();

		Card playingCard2a = cardGame2.getCard(Suit.HEARTS, Value.SEVEN);
		printer.printMessageLevel1(playingCard2a.toString());

		Card playingCard2b = cardGame1.getCard(Suit.PIKES, Value.THREE);
		printer.printMessageLevel1(playingCard2b.toString());

		Card playingCard2c = cardGame1.getCard();
		cardGame1.setCard(playingCard2c, cardGame2.getCard(Suit.HEARTS, Value.SEVEN));
		printer.printMessageLevel1(playingCard2c.toString());

		printer.printSubTitle("COMPARING CARDS USED IN BOTH GAMES");

		printer.printMessageLevel1("Shared in both games card " + Value.SEVEN + " " + Suit.HEARTS + "?");
		printer.printMessageLevel1("" + (playingCard1a == playingCard2a));

		printer.printMessageLevel1("Shared in both games card " + Value.THREE + " " + Suit.PIKES + "?");
		printer.printMessageLevel1("" + (playingCard1b == playingCard2b));

		printer.printMessageLevel1("Shared in both games wildcard?");
		printer.printMessageLevel1("" + (((WildCard) playingCard1c).getCard() == ((WildCard) playingCard2c).getCard()));

		printer.printSubTitle("COMPARING CARD AND WILDCARD IN THE SAME GAME");

		printer.printMessageLevel1("Shared in game1 card and wildcard " + Value.SEVEN + " " + Suit.HEARTS + "?");
		printer.printMessageLevel1("" + (playingCard1a == ((WildCard) playingCard1c).getCard()));

		printer.printMessageLevel1("Shared in game2 card and wildcard " + Value.SEVEN + " " + Suit.HEARTS + "?");
		printer.printMessageLevel1("" + (playingCard2a == ((WildCard) playingCard2c).getCard()));
	}
}