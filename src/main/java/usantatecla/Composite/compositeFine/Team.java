package usantatecla.Composite.compositeFine;

import java.util.ArrayList;

public class Team extends Player {

	private ArrayList<Person> teamMembers;
	private Person teamRepresentative;

	public Team(String name) {
		super();
		printer.printMessageLevel1("Creating team " + name);
		this.name = name;
		this.teamMembers = new ArrayList<Person>();
	}

	public void addPerson(Person person) {
		printer.printMessageLevel2("Adding person " + person.getName() + " to team " + this.name);
		if (!this.teamMembers.contains(person)) {
			this.teamMembers.add(person);
			this.teamRepresentative = person;
		}
	}

	public void removePerson(Person person) {
		printer.printMessageLevel2("Removing person " + person.getName() + " from team " + this.name);
		this.teamMembers.remove(person);
		if (person == this.teamRepresentative)
			this.teamRepresentative = this.teamMembers.get(0);
	}

	public ArrayList<Person> getTeamMembers() {
		printer.printMessageLevel2("Getting team members");
		return this.teamMembers;
	}

	public String play() {
		for (Person person : this.teamMembers) {
			person.play();
			printer.printMessageLevel2(person.getName() + ": Giving a proposal internally (team member)");
		}
		return this.teamRepresentative.getName() + ": Giving an answer for the question (team representative) \n";
	}
}
