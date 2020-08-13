package usantatecla.Strategy.strategyWrong;

import java.util.Random;

import usantatecla.Utils.utils.Printer;

public class Person {

	private Printer printer = Printer.getInstance();

	enum Approach {
		SHARED_FRIEND, SHARED_HOBBY, STRAIGHTFORWARD;
	}

	private Approach approach;

	private int generateRandomApproach() {
		Random randomApproach = new Random();
		return randomApproach.nextInt(Approach.values().length);
	}

	public void setApproach() {
		this.approach = Approach.values()[this.generateRandomApproach()];
	}

	public void flirt() {
		this.setApproach();
		printer.printMessageLevel2("\nTrying to flirt (person)");
		if (this.approach == Approach.SHARED_FRIEND) {
			this.approachWithSharedFriendApproach();
		} else if (this.approach == Approach.SHARED_HOBBY) {
			this.approachWithSharedHobbyApproach();
		} else if (this.approach == Approach.STRAIGHTFORWARD)
			this.approachWithStraightForwardApproach();
		printer.printMessageLevel2("Inviting to dinner (person)");
	}

	public void makeFriendship() {
		this.setApproach();
		printer.printMessageLevel2("\nTrying to make friendship (person)");
		if (this.approach == Approach.SHARED_FRIEND) {
			this.approachWithSharedFriendApproach();
		} else if (this.approach == Approach.SHARED_HOBBY) {
			this.approachWithSharedHobbyApproach();
		} else if (this.approach == Approach.STRAIGHTFORWARD)
			this.approachWithStraightForwardApproach();
		printer.printMessageLevel2("Inviting to match (person)");
	}

	private void approachWithSharedFriendApproach() {
		printer.printMessageLevel2("Using shared friend approach");
		printer.printMessageLevel3("Introduce yourself as friend of your shared friend");
		printer.printMessageLevel3("Tell a funny story you have lived with your shared friend");
		printer.printMessageLevel3("Ask how he/she met your shared friend");
		printer.printMessageLevel3("Bla bla bla ...");
	}

	private void approachWithSharedHobbyApproach() {
		printer.printMessageLevel2("Using shared hobby approach");
		printer.printMessageLevel3("Introduce yourself asking a question about your shared hobby");
		printer.printMessageLevel3("Tell he/her an interesting story you have had while practicing your shared hobby");
		printer.printMessageLevel3("Ask when he/she started to practive your shared hobby");
		printer.printMessageLevel3("Bla bla bla ...");
	}

	protected void approachWithStraightForwardApproach() {
		printer.printMessageLevel2("Using straightforward approach");
		printer.printMessageLevel3(
				"Introduce yourself and ask him/her if he/she would accept an invitation for a coffee");
	}
}
