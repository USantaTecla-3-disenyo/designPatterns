package usantatecla.Proxy.proxyFine;

import java.util.Date;

import usantatecla.Utils.utils.Printer;

public class BossProxy implements Boss {

	private Printer printer = Printer.getInstance();

	private static final int MAXIMUM_REFUND_WITHOUT_AUTHORIZATION = 100;

	private BossReal bossReal;

	public BossProxy(BossReal bossReal) {
		this.bossReal = bossReal;
	}

	
	public String answerHolidaysRequest(Date startDate, int duration) {
		printer.printMessageLevel2(
				"Received request for holidays (" + duration + " days) starting at " + startDate + " (bossProxy)");
		printer.printMessageLevel2("Sent to bossReal");
		return this.bossReal.answerHolidaysRequest(startDate, duration);
	}

	
	public String answerSalaryIncreaseRequest() {
		printer.printMessageLevel2("Received request for salary increase (bossProxy)");
		printer.printMessageLevel2("Handled by bossProxy");
		return "No (bossProxy) \n";
	}

	
	public String answerDoctorAppointmentRequest() {
		printer.printMessageLevel2("Received request for doctor appointment (bossProxy)");
		printer.printMessageLevel2("Handled by bossProxy");
		return "Yes (bossProxy) \n";
	}

	
	public String answerInvoiceRefundRequest(int quantity) {
		printer.printMessageLevel2("Received request for invoice refund of " + quantity + " euros (bossProxy)");
		if (quantity < MAXIMUM_REFUND_WITHOUT_AUTHORIZATION) {
			printer.printMessageLevel2("Handled by bossProxy");
			return "The invoice will be refunded next month (bossProxy) \n";
		} else {
			printer.printMessageLevel2("Sent to bossReal");
			return this.bossReal.answerInvoiceRefundRequest(quantity);
		}
	}
}
