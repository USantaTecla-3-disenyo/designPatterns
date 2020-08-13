package usantatecla.Mediator.mediatorWrong;

public abstract class Coach extends TeamMember {

	protected Coach(int teamId) {
		super(teamId);
	}

	protected void requestSubstitution() {
		printer.printMessageLevel1("\nRequest substitution (coach in team" + this.getTeamId() + ")");
		this.coaches[this.getRivalTeamId() - 1].answerSubstitutionRequest();
	}

	protected void answerSubstitutionRequest() {
		Answer answer = this.answerYesNoRequest();
		this.informTeamMembersAboutAnswer(answer, this.players);
		if (answer == Answer.YES) {
			printer.printMessageLevel2("Stop match (coach in team" + this.getTeamId() + ")");
			printer.printMessageLevel2("Wait until substitution is finished (coach in team" + this.getTeamId() + ")");
			printer.printMessageLevel2("Resume match (coach in team" + this.getTeamId() + ")");
		}
	}

	protected void answerMassageRequest(Player player) {
		Answer answer = this.answerYesNoRequest();
		this.informTeamMembersAboutAnswer(answer, this.players);
		if (answer == Answer.YES) {
			printer.printMessageLevel2("Stop match (coach in team" + this.getTeamId() + ")");
			this.physiotherapists[player.getTeamId() - 1].giveMassage();
			printer.printMessageLevel2("Resume match (coach in team" + this.getTeamId() + ")");
		}
	}

	protected Answer answerYesNoRequest() {
		Answer answer = Answer.values()[this.generateRandom(Answer.values().length, false)];
		printer.printMessageLevel2("Answer request as " + answer + " (" + this.getClass().getSimpleName().toLowerCase()
				+ " in team" + this.getTeamId() + ")");
		return answer;
	}

	protected abstract int generateRandom(int max, boolean homogeneouslyShare);
}
