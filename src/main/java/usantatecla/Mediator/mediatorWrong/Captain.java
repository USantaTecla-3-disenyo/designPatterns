package usantatecla.Mediator.mediatorWrong;

public abstract class Captain extends Player {

	protected Captain(int teamId, int playerId) {
		super(teamId, playerId);
	}

	protected void performCoinToss() {
		printer.printMessageLevel1("Perform coin toss (captain in team" + this.getTeamId() + ")");

		Captain choosenCaptain = this.captains[this.getRivalTeamId() - 1];
		printer.printMessageLevel2("Request captain in team" + choosenCaptain.getTeamId()
				+ " to choose head or tails (captain in team" + this.getTeamId() + ")");
		CoinSide choosenCoinSide = choosenCaptain.chooseHeadsOrTails();

		CoinSide finalCoinSide = CoinSide.values()[this.generateRandom(CoinSide.values().length, true)];
		int winnerCaptainId = choosenCaptain.getTeamId() - 1;
		if (choosenCoinSide != finalCoinSide) {
			winnerCaptainId = (winnerCaptainId + 1) % this.captains.length;
		}
		printer.printMessageLevel2("Request winner captain in team" + (winnerCaptainId + 1)
				+ " to choose goal (captain in team" + this.getTeamId() + ")");
		Goal goal = this.captains[winnerCaptainId].chooseGoal();
		this.captains[winnerCaptainId].setGoal(goal);
		int loserCaptainId = (winnerCaptainId + 1) % this.captains.length;
		int oppositeGoalId = (goal.ordinal() + 1) % Goal.values().length;
		this.captains[loserCaptainId].setGoal(Goal.values()[oppositeGoalId]);

		printer.printMessageLevel2("Inform about goal to coaches (captain in team" + this.getTeamId() + ")");
		this.informTeamMembersAboutGoal(goal, this.coaches);
		printer.printMessageLevel2("Inform about goal to players (captain in team" + this.getTeamId() + ")");
		this.informTeamMembersAboutGoal(goal, this.players);
	}

	protected CoinSide chooseHeadsOrTails() {
		printer.printMessageLevel3("Choose heads or tails (captain in team" + this.getTeamId() + ")");
		return CoinSide.values()[this.generateRandom(CoinSide.values().length, true)];
	}

	protected Goal chooseGoal() {
		Goal goal = Goal.values()[this.generateRandom(Goal.values().length, true)];
		printer.printMessageLevel3("Choose goal " + goal + " (captain in team" + this.getTeamId() + ")");
		return goal;
	}

	@Override
	protected Answer answerYesNoRequest() {
		Answer answer = null;
		Answer[] accumulativeAnswer = new Answer[this.players.length / this.captains.length];
		int teamMateIndex = 0;
		for (Player player : this.getTeamMates()) {
			accumulativeAnswer[teamMateIndex] = player.answerYesNoRequest();
			teamMateIndex++;
		}
		answer = this.provideFinalAnswerAfterConsultingTeamMates(accumulativeAnswer, accumulativeAnswer.length / 2 + 1);
		printer.printMessageLevel2("Answer request as " + answer + " (captain in team" + this.getTeamId() + ")");

		printer.printMessageLevel2("Inform about answer to coaches (captain in team" + this.getTeamId() + ")");
		this.informTeamMembersAboutAnswer(answer, this.coaches);
		printer.printMessageLevel2("Inform about anwer to players (captain in team" + this.getTeamId() + ")");
		this.informTeamMembersAboutAnswer(answer, this.players);

		return answer;
	}

	private Answer provideFinalAnswerAfterConsultingTeamMates(Answer[] accumulativeAnswer, int threshold) {
		Answer answer = Answer.NO;
		int positiveAnswers = 0;
		for (Answer partialAnswer : accumulativeAnswer) {
			if (partialAnswer == Answer.YES)
				positiveAnswers++;
			if (positiveAnswers >= threshold)
				answer = Answer.YES;
		}
		return answer;
	}

	private void informTeamMembersAboutGoal(Goal goal, TeamMember[] teamMembers) {
		for (TeamMember teamMember : teamMembers) {
			if (teamMember.getGoal() == null) {
				Goal playerGoal = this.captains[teamMember.getTeamId() - 1].getGoal();
				teamMember.setGoal(playerGoal);
				printer.printMessageLevel3("Setting goal " + playerGoal + " for teamMember in team"
						+ teamMember.getTeamId() + " (captain in team" + this.getTeamId() + ")");
			}
		}
	}
}
