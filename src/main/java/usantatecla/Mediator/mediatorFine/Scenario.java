package usantatecla.Mediator.mediatorFine;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("MEDIATOR FINE");

		printer.printSubTitle("PLAY MATCH WITH SEVERE REFEREE");
		Referee severeReferee = new SevereReferee();
		Match match1 = new Match(severeReferee);
		match1.play();

		printer.printSubTitle("PLAY MATCH WITH PERMISSIVE REFEREE");
		Referee permissiveReferee = new PermissiveReferee();
		Match match2 = new Match(permissiveReferee);
		match2.play();
	}
}