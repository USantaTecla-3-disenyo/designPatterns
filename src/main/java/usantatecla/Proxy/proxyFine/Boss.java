package usantatecla.Proxy.proxyFine;

import java.util.Date;

public interface Boss {

	public abstract String answerHolidaysRequest(Date startDate, int duration);

	public abstract String answerSalaryIncreaseRequest();

	public abstract String answerDoctorAppointmentRequest();

	public abstract String answerInvoiceRefundRequest(int quantity);

}
