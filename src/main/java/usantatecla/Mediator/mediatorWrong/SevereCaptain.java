package usantatecla.Mediator.mediatorWrong;

public class SevereCaptain extends Captain {

	protected SevereCaptain(int teamId, int playerId) {
		super(teamId, playerId);
	}

	@Override
	protected int generateRandom(int max, boolean homogeneouslyShare) {
		double percentage = 0.5;
		if (!homogeneouslyShare)
			percentage = 0.85;
		return (Math.random() < percentage) ? 0 : 1;
	}
}
