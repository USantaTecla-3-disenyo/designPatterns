package usantatecla.Iterator.iteratorFine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import usantatecla.Iterator.iteratorFine.Furniture.Room;
import usantatecla.Utils.utils.Printer;

public abstract class ShopAssistant {

	protected ArrayList<Iterator<Furniture>> floorIterators;

	public ShopAssistant(FurnitureStore furnitureStore) {
		this.furnitureStore = furnitureStore;
		ArrayList<Floor> floors = this.furnitureStore.getFloors();
		ArrayList<Iterator<Furniture>> floorIterators = new ArrayList<Iterator<Furniture>>(floors.size());
		for (Floor floor : floors) {
			Map<String, Furniture> furniture = this.furnitureStore.getFloors().get(floor.getFurnitureType())
					.getFurniture();
			Iterator<Furniture> iterator = furniture.values().iterator();
			floorIterators.add(iterator);
		}
		this.floorIterators = floorIterators;
	}

	protected Printer printer = Printer.getInstance();

	protected FurnitureStore furnitureStore;

	public abstract Furniture nextProduct(Room romm);

	public abstract boolean hasMoreProducts(Room romm);

}
