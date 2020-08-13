package usantatecla.Proxy.proxyWrong;

import java.util.Calendar;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("PROXY FINE");

		printer.printSubTitle("EMPLOYEE MAKING REQUESTS TO HIS REAL BOSS");

		Boss bossReal = new Boss();
		Employee employee = new Employee(bossReal);
		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.MONTH, 3);
		employee.requestHolidays(calendar.getTime(), 10);
		employee.requestSalaryIncrease();
		employee.requestDoctorAppointment();
		employee.requestInvoiceRefund(50);
		employee.requestInvoiceRefund(120);
	}
}