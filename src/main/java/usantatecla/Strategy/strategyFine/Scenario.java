package usantatecla.Strategy.strategyFine;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("STATE FINE");
		
		SentimentalCounselor sentimentalCounselor = new SentimentalCounselor();
		Person person = new Person();

		printer.printSubTitle("PERSON FLIRTING WITH A PERSON WHO HAS A SHARED FRIEND");
		sentimentalCounselor.teachSharedFriendApproach(person);
		person.flirt();

		printer.printSubTitle("PERSON FLIRTING WITH A PERSON WHO HAS A SHARED HOBBY");
		sentimentalCounselor.teachSharedHobbyApproach(person);
		person.flirt();
		
		printer.printSubTitle("PERSON FLIRTING WITH NOTHING IN COMMON");
		sentimentalCounselor.teachStraightForwardApproach(person);
		person.flirt();
		
		printer.printSubTitle("PERSON MAKING FRIENDSHIP WITH A PERSON WHO HAS A SHARED FRIEND");
		sentimentalCounselor.teachSharedFriendApproach(person);
		person.makeFriendship();

		printer.printSubTitle("PERSON MAKING FRIENDSHIP WITH A PERSON WHO HAS A SHARED HOBBY");
		sentimentalCounselor.teachSharedHobbyApproach(person);
		person.makeFriendship();
		
		printer.printSubTitle("PERSON MAKING FRIENDSHIP WITH NOTHING IN COMMON");
		person.makeFriendship();
	}
}