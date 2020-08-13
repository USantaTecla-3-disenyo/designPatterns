package usantatecla.Decorator.decoratorWrong;

import java.util.Date;

import usantatecla.Utils.utils.Printer;

public class Oven {

	private Printer printer = Printer.getInstance();

	private static final int REQUIRED_WAITING_TIME_TO_USE_OVEN = 2;

	private static Oven oven;

	private Date lastTimeUsage;

	public static Oven getInstance() {
		if (oven == null) {
			oven = new Oven();
		}
		return oven;
	}

	private Oven() {
		this.lastTimeUsage = new Date();
	}

	public void setLastTimeUsage(Date date) {
		printer.printMessageLevel4("Setting last time usage: " + date.toString());
		this.lastTimeUsage = date;
	}

	public boolean isReady() {
		Clock clock = new Clock();
		Date currentDate = clock.getCurrentDate();
		printer.printMessageLevel3("Checking if oven is ready");
		printer.printMessageLevel4("Current date: " + currentDate.toString());
		printer.printMessageLevel4("Last time usage: " + lastTimeUsage.toString());
		return (clock.calculateMinutesBetweenDates(currentDate,
				this.lastTimeUsage) > REQUIRED_WAITING_TIME_TO_USE_OVEN);
	}
}