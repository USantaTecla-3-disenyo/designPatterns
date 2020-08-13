package usantatecla.Mediator.mediatorFine;

import usantatecla.Mediator.mediatorFine.Referee.Goal;
import usantatecla.Utils.utils.Printer;

public abstract class TeamMember {

	protected Printer printer = Printer.getInstance();

	protected Referee referee;
	protected int teamId;
	protected Goal goal;

	protected TeamMember(int teamId) {
		super();
		this.teamId = teamId;
		this.goal = null;
	}

	protected void setReferee(Referee referee) {
		this.referee = referee;
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
}
