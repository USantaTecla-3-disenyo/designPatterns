package usantatecla.Mediator.mediatorWrong;

public class Physiotherapist extends TeamMember {

	protected Physiotherapist(int teamId) {
		super(teamId);
	}

	protected void giveMassage() {
		printer.printMessageLevel2("Give massage (physiotherapist in team" + this.getTeamId() + ")");
	}
}
