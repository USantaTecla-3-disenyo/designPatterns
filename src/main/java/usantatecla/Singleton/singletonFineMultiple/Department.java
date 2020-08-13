package usantatecla.Singleton.singletonFineMultiple;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private static final int DEPARTMENT_SIZE = 3;

	private String title;
	private List<Professor> professors;

	public Department(String tittle) {
		this.title = tittle;
		this.professors = new ArrayList<Professor>();
		for (int professorId = 0; professorId < DEPARTMENT_SIZE; professorId++) {
			this.professors.add(new Professor(title + "Professor" + (professorId + 1)));
		}
	}
	
	public List<Professor> getProfessors() {
		return professors;
	}

	@Override
	public String toString() {
		return "Department [title=" + this.title + "]";
	}	
}
