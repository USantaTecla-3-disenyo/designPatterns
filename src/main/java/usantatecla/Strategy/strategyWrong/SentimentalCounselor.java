package usantatecla.Strategy.strategyWrong;

import usantatecla.Strategy.strategyWrong.Person.Approach;
import usantatecla.Utils.utils.Printer;

public class SentimentalCounselor {
	
	private Printer printer = Printer.getInstance();

	public void teachSharedFriendApproach(Person person) {
		printer.printMessageLevel1("Teach shared friend approach (sentimentalCounselor)");
		//person.setApproach(Approach.SHARED_FRIEND);
	}

	public void teachSharedHobbyApproach(Person person) {
		printer.printMessageLevel1("Teach shared hobby approach (sentimentalCounselor)");
		//person.setApproach(Approach.SHARED_HOBBY);
	}

	public void teachStraightForwardApproach(Person person) {
		printer.printMessageLevel1("Teach straightforward approach (sentimentalCounselor)");
		//person.setApproach(Approach.STRAIGHTFORWARD);		
	}

}
