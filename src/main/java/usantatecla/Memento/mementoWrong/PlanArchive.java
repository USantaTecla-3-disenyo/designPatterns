package usantatecla.Memento.mementoWrong;

import java.util.ArrayList;
import java.util.List;

public class PlanArchive {

	private List<String> titleLists;
	private List<ArrayList<String>> participantsLists;
	private List<ArrayList<String>> detailsLists;

	private int firstPrevious;

	public PlanArchive(String title, ArrayList<String> participants, ArrayList<String> details) {
		this.titleLists = new ArrayList<String>();
		this.participantsLists = new ArrayList<ArrayList<String>>();
		this.detailsLists = new ArrayList<ArrayList<String>>();
		this.firstPrevious = 0;
	}

	public void registry(String title, ArrayList<String> participants, ArrayList<String> details) {
		for (int i = 0; i < firstPrevious; i++) {
			this.titleLists.remove(0);
			for (String participant: this.participantsLists.get(0))
				this.participantsLists.get(0).remove(participant);
			for (String detail: this.detailsLists.get(0))
				this.detailsLists.get(0).remove(detail);
		}
		this.firstPrevious = 0;

		this.titleLists.add(firstPrevious, title);
		ArrayList<String> participantsToRegister = new ArrayList<String>();	
		for (String participant : participants)
			participantsToRegister.add(participant);
		this.participantsLists.add(firstPrevious, participantsToRegister);
		ArrayList<String> detailsToRegister = new ArrayList<String>();	
		for (String detail : details)
			detailsToRegister.add(detail);
		this.detailsLists.add(firstPrevious, detailsToRegister);
	}

	public void undo(String title, ArrayList<String> participants, ArrayList<String> details) {
		this.firstPrevious++;
		setTitleAndParticipantsAndDetails(title, participants, details);
	}

	public void redo(String title, ArrayList<String> participants, ArrayList<String> details) {
		this.firstPrevious--;
		this.setTitleAndParticipantsAndDetails(title, participants, details);
	}

	private void setTitleAndParticipantsAndDetails(String title, ArrayList<String> participants, ArrayList<String> details) {
		title = this.titleLists.get(firstPrevious);
		participants.clear();
		for (String participant : this.participantsLists.get(firstPrevious))
			participants.add(participant);
		details.clear();	
		for (String detail : this.detailsLists.get(firstPrevious))
			details.add(detail);
	}

	public boolean isUndoable() {
		return this.firstPrevious < this.titleLists.size() - 1;
	}

	public boolean isRedoable() {
		return this.titleLists.size() >= 1;
	}

	@Override
	public String toString() {
		String archive = "PlanVersions [\nPosition=" + this.firstPrevious + "\nPlans=";
		for (int i = 0; i < this.titleLists.size(); i ++) {
			archive += "\n   " + i + "\tPlan = " +  this.titleLists.get(i).toString() + "\n\t   Participants = ";
			for (String participant : this.participantsLists.get(i)) {
				archive += participant + " - ";
			}
			for (String detail : this.detailsLists.get(i)) {
				archive += "\n\t\t" + detail;
			}
		}
		return archive + "]";
	}
}
