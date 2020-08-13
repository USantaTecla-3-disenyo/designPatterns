package usantatecla.Singleton.singletonFine;

import java.util.ArrayList;
import java.util.List;

public class ManagementBoard {
	
	private static final int MANAGEMENT_BOARD_SIZE = 4;

	private List<Professor> professors;
	
	public ManagementBoard() {
		this.professors = new ArrayList<Professor>();
		for (int managementBoardId = 0; managementBoardId < MANAGEMENT_BOARD_SIZE; managementBoardId++) {
			this.professors.add(new Professor("boardProfessor" + (managementBoardId + 1)));
		}
	}
	
	public List<Professor> getProfessors() {
		return professors;
	}
}
