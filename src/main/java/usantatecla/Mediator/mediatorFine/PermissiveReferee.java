package usantatecla.Mediator.mediatorFine;

public class PermissiveReferee extends Referee {

	@Override
	protected int generateRandom(int max, boolean homogeneouslyShare) {
		double percentage = 0.5;
		if (!homogeneouslyShare)
			percentage = 0.15;
		return (Math.random() < percentage) ? 0 : 1;
	}
}
