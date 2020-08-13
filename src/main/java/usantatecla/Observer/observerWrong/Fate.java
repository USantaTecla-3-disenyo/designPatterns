package usantatecla.Observer.observerWrong;

import usantatecla.Observer.observerFine.Boss;
import usantatecla.Observer.observerFine.Man;
import usantatecla.Observer.observerFine.Mother;
import usantatecla.Observer.observerFine.Partner;
import usantatecla.Observer.observerFine.Woman;
import usantatecla.Utils.utils.Printer;

public class Fate {

	private Printer printer = Printer.getInstance();

	public void provideLifeEventsForMen(Man man) {
		printer.printMessageLevel1("\nProviding life events to person (fate)");
		Mother mother = new Mother();
		man.beBorn(mother);
		Partner partner = new Partner();
		man.startRelationship(partner);
		Boss boss = new Boss();
		man.startJob(boss);	
		man.haveAFlue();
		man.loseALovedOne();
		man.wasteAllSavings();
		man.endRelationship(partner);
		man.endJob(boss);
		man.haveAFlue();
		man.becomeOrphan(mother);
	}
	
	public void provideLifeEventsForWomen(Woman woman) {
		printer.printMessageLevel1("\nProviding life events to person (fate)");
		Mother mother = new Mother();
		woman.beBorn(mother);
		Partner partner = new Partner();
		woman.startRelationship(partner);
		Boss boss = new Boss();
		woman.startJob(boss);	
		woman.haveAFlue();
		woman.loseALovedOne();
		woman.wasteAllSavings();
		woman.getPregnant();
		woman.endRelationship(partner);
		woman.endJob(boss);
		woman.havePreeclampsia();
		woman.becomeOrphan(mother);
	}
}