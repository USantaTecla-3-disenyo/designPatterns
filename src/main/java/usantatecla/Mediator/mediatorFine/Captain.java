package usantatecla.Mediator.mediatorFine;

import java.util.Random;

import usantatecla.Mediator.mediatorFine.Referee.CoinSide;
import usantatecla.Mediator.mediatorFine.Referee.Goal;

public class Captain extends Player {

	private int generateRandom(int max) {
		return new Random().nextInt(max);
	}

	protected Captain(int teamId, int playerId, Referee referee) {
		super(teamId, playerId, referee);
		this.referee.setCaptain(this);
	}

	protected CoinSide chooseHeadsOrTails() {
		printer.printMessageLevel3("Choose heads or tails (captain in team" + this.getTeamId() + ")");
		return CoinSide.values()[this.generateRandom(CoinSide.values().length)];
	}

	protected Goal chooseGoal() {
		Goal goal = Goal.values()[this.generateRandom(Goal.values().length)];
		printer.printMessageLevel3("Choose goal " + goal + " (captain in team" + this.getTeamId() + ")");
		return goal;
	}
}
