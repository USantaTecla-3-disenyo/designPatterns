package usantatecla.Strategy.strategyFine;

public class SharedFriendApproach extends Approach{
	
	@Override
	protected void approach() {
		printer.printMessageLevel2("Using shared friend approach");
		printer.printMessageLevel3("Introduce yourself as friend of your shared friend");
		printer.printMessageLevel3("Tell a funny story you have lived with your shared friend");
		printer.printMessageLevel3("Ask how he/she met your shared friend");
		printer.printMessageLevel3("Bla bla bla ...");
	}
}
