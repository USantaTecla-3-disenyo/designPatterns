package usantatecla.Proxy.proxyFine;

import java.util.Date;
import java.util.Random;

import usantatecla.Utils.utils.Printer;

public class BossReal implements Boss {

	private Printer printer = Printer.getInstance();

	private static final int MINIMUM_PRIOR_NOTICE = 60;

	enum ExpectedWorkLoad {
		lOW, HIGH
	};

	enum ExpectedAvailableCash {
		lOW, HIGH
	};

	private int generateRandom(int max) {
		return new Random().nextInt(max);
	}

	
	public String answerHolidaysRequest(Date startDate, int duration) {
		printer.printMessageLevel2(
				"Received request for holidays (" + duration + " days) starting at " + startDate + " (bossReal)");
		if (duration > 15)
			return "Not approved, period is too long (bossReal) \n";
		else if (!this.differenceInMonthsBetweenDatesHigherThanThreshold(new Date(), startDate, MINIMUM_PRIOR_NOTICE))
			return "Not approved, period is too close (bossReal)";
		else if (this.generateRandom(ExpectedWorkLoad.values().length) == ExpectedWorkLoad.HIGH.ordinal())
			return "Not approved, expected busy period (bossReal) \n";
		else
			return "Approved (bossReal) \n";
	}

	
	public String answerSalaryIncreaseRequest() {
		printer.printMessageLevel2("Received request for salary increase (bossReal)");
		return "No (bossReal) \n";
	}

	
	public String answerDoctorAppointmentRequest() {
		printer.printMessageLevel2("Received request for doctor appointment (bossReal)");
		return "Yes (bossReal) \n";
	}

	
	public String answerInvoiceRefundRequest(int quantity) {
		printer.printMessageLevel2("Received request for invoice refund of " + quantity + " euros (bossReal)");
		if (this.generateRandom(ExpectedAvailableCash.values().length) == ExpectedAvailableCash.HIGH.ordinal())
			return "The invoice will be refunded next month (bossReal) \n";
		else
			return "The invoice will be refunded next quarter (bossReal) \n";
	}

	private boolean differenceInMonthsBetweenDatesHigherThanThreshold(Date date1, Date date2, int threshold) {
		return ((date2.getTime() - date1.getTime()) / 86400000) > threshold;
	}
}
