package usantatecla.Command.commandWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("COMMAND WRONG");

		Chef chefs[] = new Chef[Restaurant.MAX_NUMBER_EMPLOYEES_PER_TYPE];
		Barman barmen[] = new Barman[Restaurant.MAX_NUMBER_EMPLOYEES_PER_TYPE];
		Waiter waiter = new Waiter(chefs, barmen);

		for (int employeeId = 0; employeeId < Restaurant.MAX_NUMBER_EMPLOYEES_PER_TYPE; employeeId++) {
			chefs[employeeId] = new Chef("chef" + (employeeId + 1));
			barmen[employeeId] = new Barman("barman" + (employeeId + 1));
		}

		Restaurant restaurant = new Restaurant(waiter, chefs, barmen);

		printer.printSubTitle("RESTAURANT ATTENDING TO CUSTOMERS AT LUCH TIME");

		restaurant.attendToCustomersAtLunchTime();

		printer.printSubTitle("RESTAURANT ATTENDING TO CUSTOMERS AT DINNER TIME");

		restaurant.attendToCustomersAtDinnerTime();
	}
}