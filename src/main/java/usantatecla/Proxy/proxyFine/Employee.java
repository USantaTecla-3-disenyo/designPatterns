package usantatecla.Proxy.proxyFine;

import java.util.Date;

import usantatecla.Utils.utils.Printer;

public class Employee {

	private Printer printer = Printer.getInstance();

	private Boss boss;

	public Employee(Boss boss) {
		this.boss = boss;
	}

	public void setBoss(Boss boss) {
		this.boss = boss;
	}

	public void requestHolidays(Date startDate, int duration) {
		printer.printMessageLevel1("Send request for holidays (employee)");
		String answer = this.boss.answerHolidaysRequest(startDate, duration);
		printer.printMessageLevel1("Answer received: " + answer);
	}

	public void requestSalaryIncrease() {
		printer.printMessageLevel1("Send request for salary increase (employee)");
		String answer = this.boss.answerSalaryIncreaseRequest();
		printer.printMessageLevel1("Answer received: " + answer);
	}

	public void requestDoctorAppointment() {
		printer.printMessageLevel1("Send request for doctor appointment (employee)");
		String answer = this.boss.answerDoctorAppointmentRequest();
		printer.printMessageLevel1("Answer received: " + answer);
	}

	public void requestInvoiceRefund(int quantity) {
		printer.printMessageLevel1("Send request for invoice refund (employee)");
		String answer = this.boss.answerInvoiceRefundRequest(quantity);
		printer.printMessageLevel1("Answer received: " + answer);
	}
}
