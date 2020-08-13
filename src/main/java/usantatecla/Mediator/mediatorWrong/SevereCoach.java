package usantatecla.Mediator.mediatorWrong;

public class SevereCoach extends Coach {

	protected SevereCoach(int teamId) {
		super(teamId);
	}

	@Override
	protected int generateRandom(int max, boolean homogeneouslyShare) {
		double percentage = 0.5;
		if (!homogeneouslyShare)
			percentage = 0.85;
		return (Math.random() < percentage) ? 0 : 1;
	}
}
