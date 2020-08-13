package usantatecla.Iterator.iteratorFine;

import java.util.HashMap;
import java.util.Map;

public class Floor {

	private int furnitureType;
	private Map<String, Furniture> furniture;

	public Floor(int furnitureType) {
		this.furnitureType = furnitureType;
		this.furniture = new HashMap<String, Furniture>();
	}

	public void addFurniture(Furniture furniture) {
		this.furniture.putIfAbsent(furniture.getName(), furniture);
	}

	public Map<String, Furniture> getFurniture() {
		return furniture;
	}

	public int getFurnitureType() {
		return furnitureType;
	}

	@Override
	public String toString() {
		String furnitureList = "";
		for (Furniture furniture : this.furniture.values()) {
			furnitureList += furniture.toString();
		}
		return " [" + furnitureList + "]";
	}
}
