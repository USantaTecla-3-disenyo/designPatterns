package usantatecla.Mediator.mediatorWrong;

public class PermissiveCoach extends Coach {

	protected PermissiveCoach(int teamId) {
		super(teamId);
	}

	@Override
	protected int generateRandom(int max, boolean homogeneouslyShare) {
		double percentage = 0.5;
		if (!homogeneouslyShare)
			percentage = 0.15;
		return (Math.random() < percentage) ? 0 : 1;
	}
}
