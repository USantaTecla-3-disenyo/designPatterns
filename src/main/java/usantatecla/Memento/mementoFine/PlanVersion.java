package usantatecla.Memento.mementoFine;

import java.util.ArrayList;

public class PlanVersion {

	private String title;
	private ArrayList<String> participants = new ArrayList<String>();
	private ArrayList<String> details = new ArrayList<String>();

	public PlanVersion(String title, ArrayList<String> participants, ArrayList<String> details) {
		this.title = title;
		if (!participants.isEmpty()) {
			for (String participant : participants)
				this.participants.add(participant);
		}
		if (!details.isEmpty()) {
			for (String detail : details)
				this.details.add(detail);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public ArrayList<String> getParticipants() {
		return this.participants;
	}

	public ArrayList<String> getDetails() {
		return this.details;
	}

	public String toString() {
		String planInfo = "\tPlan = " + this.title + "\n\t   Participants = ";
		for (String participant : this.participants) {
			planInfo += participant + " - ";
		}

		for (String detail : this.details) {
			planInfo += "\n\t\t" + detail;
		}
		return planInfo;
	}
}
