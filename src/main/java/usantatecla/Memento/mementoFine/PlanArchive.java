package usantatecla.Memento.mementoFine;

import java.util.ArrayList;
import java.util.List;

public class PlanArchive {

	private Plan plan;
	private List<PlanVersion> planVersions;
	private int firstPrevious;

	public PlanArchive(Plan plan) {
		this.plan = plan;
		this.planVersions = new ArrayList<PlanVersion>();
		this.firstPrevious = 0;
	}

	public void registry() {
		for (int i = 0; i < this.firstPrevious; i++) {
			this.planVersions.remove(0);
		}
		this.firstPrevious = 0;
		this.planVersions.add(this.firstPrevious, this.plan.createPlanVersion());
	}

	public void undo() {
		this.firstPrevious++;
		this.plan.setPlanVersion(this.planVersions.get(this.firstPrevious));
	}

	public void redo() {
		this.firstPrevious--;
		this.plan.setPlanVersion(this.planVersions.get(this.firstPrevious));
	}

	public boolean isUndoable() {
		return this.firstPrevious < this.planVersions.size() - 1;
	}

	public boolean isRedoable() {
		return this.firstPrevious >= 1;
	}

	@Override
	public String toString() {
		String archive = "PlanVersions [\nPosition=" + this.firstPrevious + "\nPlans=";
		int i = 0;
		for (PlanVersion planVersion : this.planVersions) {
			archive += "\n   " + i + planVersion.toString();
			i++;
		}
		return archive + "]";
	}
}
