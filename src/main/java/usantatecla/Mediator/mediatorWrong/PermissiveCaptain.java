package usantatecla.Mediator.mediatorWrong;

public class PermissiveCaptain extends Captain {

	protected PermissiveCaptain(int teamId, int playerId) {
		super(teamId, playerId);
	}

	@Override
	protected int generateRandom(int max, boolean homogeneouslyShare) {
		double percentage = 0.5;
		if (!homogeneouslyShare)
			percentage = 0.15;
		return (Math.random() < percentage) ? 0 : 1;
	}
}
