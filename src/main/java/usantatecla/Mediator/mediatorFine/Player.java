package usantatecla.Mediator.mediatorFine;

public class Player extends TeamMember {

	protected int playerId;

	protected Player(int teamId, int playerId, Referee referee) {
		super(teamId);
		this.playerId = playerId;
		this.referee = referee;
		this.referee.setPlayer(this);
	}

	protected int getPlayerId() {
		return playerId;
	}

	protected void requestYellowCard() {
		printer.printMessageLevel1(
				"\nRequest yellow card (player" + this.playerId + " in team" + this.getTeamId() + ")");
		this.referee.answerYesNoRequest();
	}

	protected void requestRedCard() {
		printer.printMessageLevel1("\nRequest red card (player" + this.playerId + " in team" + this.getTeamId() + ")");
		this.referee.answerYesNoRequest();
	}

	protected void requestPenalti() {
		printer.printMessageLevel1("\nRequest penalti (captain in team" + this.getTeamId() + ")");
		this.referee.answerYesNoRequest();
	}

	protected void requestMassage() {
		printer.printMessageLevel1("\nRequest massage (player" + this.playerId + " in team" + this.getTeamId() + ")");
		this.referee.answerMassageRequest(this);
	}
}
