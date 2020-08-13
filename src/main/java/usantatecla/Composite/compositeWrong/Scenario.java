package usantatecla.Composite.compositeWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("COMPOSITE WRONG");

		Team team1 = new Team("team1");
		Person person1InTeam1 = new Person("person1InTeam1");
		team1.addPerson(person1InTeam1);
		Person person2InTeam1 = new Person("person2InTeam1");
		team1.addPerson(person2InTeam1);

		Person personAlone1 = new Person("personAlone1");
		Person personAlone2 = new Person("personAlone2");

		Game game = new Game();

		printer.printSubTitle("PLAYING GAME WITH TEAM AND PERSON");
		game.play(team1, personAlone1);

		printer.printSubTitle("PLAYING GAME WITH PERSON AND TEAM");
		game.play(personAlone1, team1);

		printer.printSubTitle("PLAYING GAME WITH PERSON AND PERSON");
		game.play(personAlone1, personAlone2);
	}
}