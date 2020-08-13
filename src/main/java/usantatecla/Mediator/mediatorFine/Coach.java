package usantatecla.Mediator.mediatorFine;

public class Coach extends TeamMember {

	protected Coach(int teamId, Referee referee) {
		super(teamId);
		this.referee = referee;
		this.referee.setCoach(this);
	}

	protected void requestSubstitution() {
		printer.printMessageLevel1("\nRequest substitution (coach in team" + this.getTeamId() + ")");
		this.referee.answerSubstitutionRequest();
	}
}
