package usantatecla.Decorator.decoratorFine;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Clock {

	public Clock() {
	}

	public Date getCurrentDate() {
		Date currentDate = new Date();
		return currentDate;
	}

	public long calculateMinutesBetweenDates(Date date1, Date date2) {
		long minutes = (date1.getTime() - date2.getTime()) / 60000;
		return Math.abs(minutes);
	}

	public void setAlarmDelay(int delay) {
		try {
			TimeUnit.MINUTES.sleep(delay);
		} catch (InterruptedException e) {
		}
	}
}