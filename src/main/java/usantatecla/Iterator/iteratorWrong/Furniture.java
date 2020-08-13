package usantatecla.Iterator.iteratorWrong;

public class Furniture {

	enum Room {
		LIVINGROOM, BEDROOM, GARDEN
	};

	enum Size {
		SMALL, MEDIUM, LARGE
	};

	private String name;
	private Room room;
	private Size size;

	public Furniture(String name, Room room, Size size) {
		this.name = name;
		this.room = room;
		this.size = size;
	}

	public String getName() {
		return this.name;
	}

	public Room getRoom() {
		return room;
	}

	public Size getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Furniture [name=" + name + ", room=" + room + ", size=" + size + "] - ";
	}
}
