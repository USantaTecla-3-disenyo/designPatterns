package usantatecla.Mediator.mediatorFine;

import usantatecla.Utils.utils.Printer;

public abstract class Referee {

	private Printer printer = Printer.getInstance();

	enum CoinSide {
		HEADS, TAILS
	};

	enum Goal {
		LEFT, RIGHT
	};

	enum Answer {
		YES, NO
	};

	private Coach[] coaches;
	private Physiotherapist[] physiotherapists;
	private Captain[] captains;
	private Player[] players;

	public Referee() {
		this.coaches = new Coach[Match.TEAMS];
		this.physiotherapists = new Physiotherapist[Match.TEAMS];
		this.captains = new Captain[Match.TEAMS];
		this.players = new Player[Match.TEAMS * Match.PLAYERS_IN_TEAM];
	}

	protected void setCoach(Coach coach) {
		for (int i = 0; i < this.coaches.length; i++)
			if (this.coaches[i] == null) {
				this.coaches[i] = coach;
				break;
			}
	}

	protected void setPhysiotherapist(Physiotherapist physiotherapist) {
		for (int i = 0; i < this.physiotherapists.length; i++)
			if (this.physiotherapists[i] == null) {
				this.physiotherapists[i] = physiotherapist;
				break;
			}
	}

	protected void setCaptain(Captain captain) {
		for (int i = 0; i < this.captains.length; i++)
			if (this.captains[i] == null) {
				this.captains[i] = captain;
				break;
			}
	}

	protected void setPlayer(Player player) {
		for (int i = 0; i < this.players.length; i++)
			if (this.players[i] == null) {
				this.players[i] = player;
				break;
			}
	}

	protected void performCoinToss() {
		printer.printMessageLevel1("Perform coin toss (referee)");

		Captain choosenCaptain = this.captains[this.generateRandom(this.captains.length, true)];
		printer.printMessageLevel2(
				"Request captain in team" + choosenCaptain.getTeamId() + " to choose head or tails (referee)");
		CoinSide choosenCoinSide = choosenCaptain.chooseHeadsOrTails();

		CoinSide finalCoinSide = CoinSide.values()[this.generateRandom(CoinSide.values().length, true)];
		int winnerCaptainId = choosenCaptain.getTeamId() - 1;
		if (choosenCoinSide != finalCoinSide) {
			winnerCaptainId = (winnerCaptainId + 1) % this.captains.length;
		}
		printer.printMessageLevel2(
				"Request winner captain in team" + (winnerCaptainId + 1) + " to choose goal (referee)");
		Goal goal = this.captains[winnerCaptainId].chooseGoal();
		this.captains[winnerCaptainId].setGoal(goal);
		int loserCaptainId = (winnerCaptainId + 1) % this.captains.length;
		int oppositeGoalId = (goal.ordinal() + 1) % Goal.values().length;
		this.captains[loserCaptainId].setGoal(Goal.values()[oppositeGoalId]);

		printer.printMessageLevel2("Inform about goal to coaches (referee)");
		this.informTeamMembersAboutGoal(goal, this.coaches);
		printer.printMessageLevel2("Inform about goal to players (referee)");
		this.informTeamMembersAboutGoal(goal, this.players);
	}

	private void informTeamMembersAboutGoal(Goal goal, TeamMember[] teamMembers) {
		for (TeamMember teamMember : teamMembers) {
			if (teamMember.getGoal() == null) {
				Goal playerGoal = this.captains[teamMember.getTeamId() - 1].getGoal();
				teamMember.setGoal(playerGoal);
				printer.printMessageLevel3("Setting goal " + playerGoal + " for teamMember in team"
						+ teamMember.getTeamId() + " (referee)");
			}
		}
	}

	protected Answer answerYesNoRequest() {
		Answer answer = Answer.values()[this.generateRandom(Answer.values().length, false)];
		printer.printMessageLevel2("Answer request as " + answer + " (referee)");
		printer.printMessageLevel2("Inform about answer to coaches (referee)");
		this.informTeamMembersAboutAnswer(answer, this.coaches);
		printer.printMessageLevel2("Inform about anwer to players (referee)");
		this.informTeamMembersAboutAnswer(answer, this.players);
		return answer;
	}

	private void informTeamMembersAboutAnswer(Answer answer, TeamMember[] teamMembers) {
		for (TeamMember teamMember : teamMembers) {
			printer.printMessageLevel3("Informing about answer " + answer + " to teamMember in team"
					+ teamMember.getTeamId() + " (referee)");
		}
	}

	protected void answerSubstitutionRequest() {
		Answer answer = this.answerYesNoRequest();
		if (answer == Answer.YES) {
			printer.printMessageLevel2("Stop match (referee)");
			printer.printMessageLevel2("Wait until substitution is finished (referee)");
			printer.printMessageLevel2("Resume match (referee)");
		}
	}

	protected void answerMassageRequest(Player player) {
		Answer answer = this.answerYesNoRequest();
		if (answer == Answer.YES) {
			printer.printMessageLevel2("Stop match (referee)");
			this.physiotherapists[player.getTeamId() - 1].giveMassage();
			printer.printMessageLevel2("Resume match (referee)");
		}
	}

	protected abstract int generateRandom(int max, boolean homogeneouslyShare);
}
