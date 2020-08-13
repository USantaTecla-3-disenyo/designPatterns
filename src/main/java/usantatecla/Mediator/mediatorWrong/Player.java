package usantatecla.Mediator.mediatorWrong;

public abstract class Player extends TeamMember {

	protected int playerId;

	protected Player(int teamId, int playerId) {
		super(teamId);
		this.playerId = playerId;
	}

	protected int getPlayerId() {
		return playerId;
	}

	protected void requestYellowCard() {
		printer.printMessageLevel1(
				"\nRequest yellow card (player" + this.playerId + " in team" + this.getTeamId() + ")");
		this.captains[this.getRivalTeamId() - 1].answerYesNoRequest();
	}

	protected void requestRedCard() {
		printer.printMessageLevel1("\nRequest red card (player" + this.playerId + " in team" + this.getTeamId() + ")");
		this.captains[this.getRivalTeamId() - 1].answerYesNoRequest();
	}

	protected void requestPenalti() {
		printer.printMessageLevel1("\nRequest penalti (captain in team" + this.getTeamId() + ")");
		this.captains[this.getRivalTeamId() - 1].answerYesNoRequest();
	}

	protected void requestMassage() {
		printer.printMessageLevel1("\nRequest massage (player" + this.playerId + " in team" + this.getTeamId() + ")");
		this.coaches[this.getRivalTeamId() - 1].answerMassageRequest(this);
	}

	protected Answer answerYesNoRequest() {
		Answer answer = Answer.values()[this.generateRandom(Answer.values().length, false)];
		printer.printMessageLevel2("Answer request as " + answer + " (" + this.getClass().getSimpleName().toLowerCase()
				+ " in team" + this.getTeamId() + ")");
		return answer;
	}

	protected abstract int generateRandom(int max, boolean homogeneouslyShare);
}
