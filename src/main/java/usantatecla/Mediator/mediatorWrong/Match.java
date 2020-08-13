package usantatecla.Mediator.mediatorWrong;

import java.util.Random;

public class Match {

	enum SeverityLevel {
		SEVERE, PERMISSIVE
	};

	final int TEAMS = 2;
	final int PLAYERS_IN_TEAM = 5;

	private Player[] players;
	private Captain[] captains;
	private Coach[] coaches;
	private Physiotherapist[] physiotherapists;

	public Match(SeverityLevel severityLevel) {

		this.coaches = new Coach[TEAMS];
		for (int team = 0; team < TEAMS; team++) {
			if (severityLevel == SeverityLevel.PERMISSIVE)
				this.coaches[team] = new PermissiveCoach(team + 1);
			else if (severityLevel == SeverityLevel.SEVERE)
				this.coaches[team] = new SevereCoach(team + 1);
		}

		this.physiotherapists = new Physiotherapist[TEAMS];
		for (int team = 0; team < TEAMS; team++) {
			this.physiotherapists[team] = new Physiotherapist(team + 1);
		}

		this.captains = new Captain[TEAMS];
		for (int team = 0; team < TEAMS; team++) {
			if (severityLevel == SeverityLevel.PERMISSIVE)
				this.captains[team] = new PermissiveCaptain(team + 1, 1);
			else if (severityLevel == SeverityLevel.SEVERE)
				this.captains[team] = new SevereCaptain(team + 1, 1);
		}

		this.players = new Player[TEAMS * PLAYERS_IN_TEAM];
		for (int team = 0; team < TEAMS; team++) {
			this.players[team * PLAYERS_IN_TEAM] = this.captains[team];
		}
		for (int team = 0; team < TEAMS; team++) {
			for (int player = 0; player < (TEAMS * PLAYERS_IN_TEAM) / 2; player++) {
				if (severityLevel == SeverityLevel.PERMISSIVE)
					this.players[(team * PLAYERS_IN_TEAM) + player] = new PermissivePlayer(team + 1, player + 1);
				else if (severityLevel == SeverityLevel.SEVERE)
					this.players[(team * PLAYERS_IN_TEAM) + player] = new SeverePlayer(team + 1, player + 1);
			}
		}
		this.setTeamMembers(this.coaches);
		this.setTeamMembers(this.captains);
		this.setTeamMembers(this.players);
		this.setTeamMembers(this.physiotherapists);
	}

	private void setTeamMembers(TeamMember[] teamMembers) {
		for (TeamMember teamMember : teamMembers) {
			teamMember.setPlayers(this.players);
			teamMember.setCoaches(this.coaches);
			teamMember.setCaptains(this.captains);
			teamMember.setPhysiotherapists(this.physiotherapists);
		}
	}

	private int generateRandom(int max) {
		Random random = new Random();
		return random.nextInt(max);
	}

	public void play() {
		this.captains[this.generateRandom(this.captains.length)].performCoinToss();
		this.players[this.generateRandom(this.players.length)].requestYellowCard();
		this.players[this.generateRandom(this.players.length)].requestRedCard();
		this.captains[this.generateRandom(this.captains.length)].requestPenalti();
		this.players[this.generateRandom(this.players.length)].requestMassage();
		this.coaches[this.generateRandom(this.coaches.length)].requestSubstitution();
	}
}
