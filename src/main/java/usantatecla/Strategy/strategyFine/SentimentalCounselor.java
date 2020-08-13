package usantatecla.Strategy.strategyFine;

import usantatecla.Utils.utils.Printer;

public class SentimentalCounselor {
	
	private Printer printer = Printer.getInstance();

	public void teachSharedFriendApproach(Person person) {
		printer.printMessageLevel1("Teach shared friend approach (sentimentalCounselor)");
		person.setApproach(new SharedFriendApproach());
	}

	public void teachSharedHobbyApproach(Person person) {
		printer.printMessageLevel1("Teach shared hobby approach (sentimentalCounselor)");
		person.setApproach(new SharedHobbyApproach());
	}

	public void teachStraightForwardApproach(Person person) {
		printer.printMessageLevel1("Teach straightforward approach (sentimentalCounselor)");
		person.setApproach(new StraightForwardApproach());		
	}

}
