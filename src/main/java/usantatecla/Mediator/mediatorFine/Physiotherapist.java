package usantatecla.Mediator.mediatorFine;

public class Physiotherapist extends TeamMember {

	protected Physiotherapist(int teamId, Referee referee) {
		super(teamId);
		this.referee = referee;
		this.referee.setPhysiotherapist(this);
	}

	protected void giveMassage() {
		printer.printMessageLevel2("Give massage (physiotherapist in team" + this.getTeamId() + ")");
	}
}
