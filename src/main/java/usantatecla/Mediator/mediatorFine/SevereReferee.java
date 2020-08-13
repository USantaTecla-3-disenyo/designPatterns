package usantatecla.Mediator.mediatorFine;

public class SevereReferee extends Referee {

	@Override
	protected int generateRandom(int max, boolean homogeneouslyShare) {
		double percentage = 0.5;
		if (!homogeneouslyShare)
			percentage = 0.85;
		return (Math.random() < percentage) ? 0 : 1;
	}
}
