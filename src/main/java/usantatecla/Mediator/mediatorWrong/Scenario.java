package usantatecla.Mediator.mediatorWrong;

import usantatecla.Mediator.mediatorWrong.Match.SeverityLevel;
import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("MEDIATOR WRONG");

		printer.printSubTitle("PLAY MATCH WITH SEVERE PLAYERS AND COACHES");
		Match match1 = new Match(SeverityLevel.SEVERE);
		match1.play();

		printer.printSubTitle("PLAY MATCH WITH PERMISSIVE PLAYERS AND COACHES");
		Match match2 = new Match(SeverityLevel.PERMISSIVE);
		match2.play();
	}
}