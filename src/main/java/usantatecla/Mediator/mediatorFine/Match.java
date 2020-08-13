package usantatecla.Mediator.mediatorFine;

import java.util.Random;

public class Match {

	final static int TEAMS = 2;
	final static int PLAYERS_IN_TEAM = 5;

	private Player[] players;
	private Captain[] captains;
	private Coach[] coaches;
	private Physiotherapist[] physiotherapists;
	private Referee referee;

	public Match(Referee referee) {
		this.referee = referee;

		this.coaches = new Coach[TEAMS];
		for (int team = 0; team < TEAMS; team++) {
			this.coaches[team] = new Coach(team + 1, this.referee);
		}

		this.physiotherapists = new Physiotherapist[TEAMS];
		for (int team = 0; team < TEAMS; team++) {
			this.physiotherapists[team] = new Physiotherapist(team + 1, this.referee);
		}

		this.captains = new Captain[TEAMS];
		for (int team = 0; team < TEAMS; team++) {
			this.captains[team] = new Captain(team + 1, 1, this.referee);
		}

		this.players = new Player[TEAMS * PLAYERS_IN_TEAM];
		for (int team = 0; team < TEAMS; team++) {
			this.players[team] = this.captains[team];
		}
		for (int team = 0; team < TEAMS; team++) {
			for (int player = 0; player < (PLAYERS_IN_TEAM - 1); player++) {
				this.players[(team * PLAYERS_IN_TEAM) + player + 1] = new Player(team + 1, player + 1, this.referee);
			}
		}
	}

	private int generateRandom(int max) {
		Random random = new Random();
		return random.nextInt(max);
	}

	public void play() {
		this.referee.performCoinToss();
		this.players[this.generateRandom(PLAYERS_IN_TEAM)].requestYellowCard();
		this.players[this.generateRandom(PLAYERS_IN_TEAM)].requestRedCard();
		this.captains[this.generateRandom(TEAMS)].requestPenalti();
		this.players[this.generateRandom(PLAYERS_IN_TEAM)].requestMassage();
		this.coaches[this.generateRandom(TEAMS)].requestSubstitution();
	}
}
