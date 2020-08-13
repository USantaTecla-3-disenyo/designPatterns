package usantatecla.Proxy.proxyFine;

import java.util.Calendar;
import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("PROXY FINE");

		printer.printSubTitle("EMPLOYEE MAKING REQUESTS TO HIS REAL BOSS");

		BossReal bossReal = new BossReal();
		Employee employee = new Employee(bossReal);
		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.MONTH, 3);
		employee.requestHolidays(calendar.getTime(), 10);
		employee.requestSalaryIncrease();
		employee.requestDoctorAppointment();
		employee.requestInvoiceRefund(50);
		employee.requestInvoiceRefund(120);

		printer.printSubTitle("EMPLOYEE MAKING REQUESTS TO THE BOSS PROXY");

		BossProxy bossProxy = new BossProxy(bossReal);
		employee.setBoss(bossProxy);

		calendar.add(Calendar.MONTH, 1);
		employee.requestHolidays(calendar.getTime(), 20);
		employee.requestSalaryIncrease();
		employee.requestDoctorAppointment();
		employee.requestInvoiceRefund(50);
		employee.requestInvoiceRefund(120);
	}
}