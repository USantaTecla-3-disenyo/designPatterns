package usantatecla.Strategy.strategyFine;

public class StraightForwardApproach extends Approach{
	
	@Override
	protected void approach() {
		printer.printMessageLevel2("Using straightforward approach");
		printer.printMessageLevel3("Introduce yourself and ask him/her if he/she would accept an invitation for a coffee");
	}
}
