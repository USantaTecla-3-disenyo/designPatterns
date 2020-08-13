package usantatecla.Memento.mementoWrong;

import java.util.ArrayList;
import java.util.Date;

import usantatecla.Utils.utils.Printer;

public class Plan {

	private Printer printer = Printer.getInstance();

	private String title;
	private Date date;
	private ArrayList<String> participants;
	private ArrayList<String> details;
	private String coordinator;
	private String secretary;

	public Plan(String title, Date date, ArrayList<String> participants, ArrayList<String> details) {
		this.title = title;
		this.date = date;
		this.participants = new ArrayList<String>();
		for (String participant : participants)
			this.participants.add(participant);
		this.details = new ArrayList<String>();
		for (String detail : details)
			this.details.add(detail);
		this.coordinator = this.participants.get(0);
		this.secretary = this.participants.get(participants.size()-1);
	}

	public void setTitle(String title) {
		this.title = title;
		printer.printMessageLevel2("Modifying title to \"" + title + "\" (plan)");
	}

	public void addParticipant(String participant) {
		if (!this.participants.contains(participant)) {
			this.participants.add(participant);
			int participantIndex = this.participants.indexOf(participant);
			if (participantIndex == 0)
				this.coordinator = this.participants.get(0);
			printer.printMessageLevel2("Adding participant " + participant + " (plan)");
		}
		this.secretary = participant;
	}

	public void removeParticipant(String participant) {
		int participantIndex = this.participants.indexOf(participant);
		if (participantIndex == this.participants.size()-1)
			this.secretary = (this.participants.size() > 1) ? this.participants.get(this.participants.size()-2) : "";
		if (participantIndex == 0)
			this.coordinator = (this.participants.size() > 1) ? this.participants.get(1) : "";
		this.participants.remove(participant);
		printer.printMessageLevel2("Removing participant " + participant + " (plan)");
	}

	public void addDetail(String detail) {
		if (!this.details.contains(detail)) {
			this.details.add(detail);
			printer.printMessageLevel2("Adding detail " + detail + " (plan)");
		}
	}
	
	public void removeDetail(String detail) {
		this.details.remove(detail);
		printer.printMessageLevel2("Removing detail " + detail + " (plan)");
	}

	/**
	 * @param coordinator the coordinator to set
	 */
	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

	/**
	 * @param secretary the secretary to set
	 */
	
	public void setSecretary(String secretary) {
		this.secretary = secretary;
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

	@Override
	public String toString() {
		String planInfo = "\n\tPlan = " + this.title + "\n\t   Date = " + this.date + "\n\t   Participants = ";
		for (String participant : this.participants) {
			planInfo += participant + " - ";
		}
		planInfo += "\n\t   Coordinator = " + this.coordinator + "\n\t   Secretary = " + this.secretary;
		for (String detail : this.details) {
			planInfo += "\n\t\t" + detail;
		}
		return planInfo + "\n";
	}
}
