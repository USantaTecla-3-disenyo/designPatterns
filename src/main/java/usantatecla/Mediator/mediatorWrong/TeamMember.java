package usantatecla.Mediator.mediatorWrong;

import usantatecla.Utils.utils.Printer;

public abstract class TeamMember {

	protected Printer printer = Printer.getInstance();

	enum CoinSide {
		HEADS, TAILS
	};

	enum Goal {
		LEFT, RIGHT
	};

	enum Answer {
		YES, NO
	};

	protected Coach[] coaches;
	protected Captain[] captains;
	protected Player[] players;
	protected Physiotherapist[] physiotherapists;

	private int teamId;
	private Goal goal;

	protected TeamMember(int teamId) {
		super();
		this.teamId = teamId;
		this.goal = null;
	}

	protected void setGoal(Goal goal) {
		this.goal = goal;
	}

	protected Goal getGoal() {
		return goal;
	}

	protected int getTeamId() {
		return teamId;
	}

	protected void setCoaches(Coach[] coaches) {
		this.coaches = coaches;
	}

	protected void setPhysiotherapists(Physiotherapist[] physiotherapists) {
		this.physiotherapists = physiotherapists;
	}

	protected void setCaptains(Captain[] captains) {
		this.captains = captains;
	}

	protected void setPlayers(Player[] players) {
		this.players = players;
	}

	protected int getRivalTeamId() {
		int returned = 1;
		if (this.getTeamId() == returned)
			returned = 2;
		return returned;
	}

	protected Player[] getTeamMates() {
		Player[] playMates = new Player[this.players.length / 2];
		int teamMateIndex = 0;
		for (Player player : this.players) {
			if (this.teamId == player.getTeamId()) {
				playMates[teamMateIndex] = player;
				teamMateIndex++;
			}
		}
		return playMates;
	}

	protected void informTeamMembersAboutAnswer(Answer answer, TeamMember[] teamMembers) {
		for (TeamMember teamMember : teamMembers) {
			printer.printMessageLevel3("Informing about answer " + answer + " to "
					+ teamMember.getClass().getSimpleName().toLowerCase() + " in team" + teamMember.getTeamId() + " ("
					+ this.getClass().getSimpleName().toLowerCase() + " in team" + this.getTeamId() + ")");
		}
	}
}
