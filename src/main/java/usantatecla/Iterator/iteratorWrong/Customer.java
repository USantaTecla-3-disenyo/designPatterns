package usantatecla.Iterator.iteratorWrong;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import usantatecla.Iterator.iteratorWrong.Furniture.Room;
import usantatecla.Utils.utils.Printer;

public class Customer {

	private Printer printer = Printer.getInstance();

	private ArrayList<Iterator<Furniture>> floorIterators;

	public void buyRoomFurnitureIntoRoomOrganizedFurnitureStore(FurnitureStore furnitureStore, Room room) {
		printer.printMessageLevel1("Looking for all " + room.name() + " furniture (customer)\n");
		this.discoverFurnitureStoreFloors(furnitureStore);
		while (this.hasMoreProductsInRoomOrganizedFurnitureStore(room)) {
			this.nextProductInRoomOrganizedFurnitureStore(room);
		}
	}

	public void buyRoomFurnitureIntoSizeOrganizedFurnitureStore(FurnitureStore furnitureStore, Room room) {
		printer.printMessageLevel1("Looking for all " + room.name() + " furniture (customer)\n");
		this.discoverFurnitureStoreFloors(furnitureStore);
		while (this.hasMoreProductsInSizeOrganizedFurnitureStore(furnitureStore, room)) {
			this.nextProductInSizeOrganizedFurnitureStore(furnitureStore, room);
		}
	}

	private void discoverFurnitureStoreFloors(FurnitureStore furnitureStore) {
		ArrayList<Floor> floors = furnitureStore.getFloors();
		ArrayList<Iterator<Furniture>> floorIterators = new ArrayList<Iterator<Furniture>>(floors.size());
		for (Floor floor : floors) {
			Map<String, Furniture> furniture = furnitureStore.getFloors().get(floor.getFurnitureType()).getFurniture();
			Iterator<Furniture> iterator = furniture.values().iterator();
			floorIterators.add(iterator);
		}
		this.floorIterators = floorIterators;
	}

	private Furniture nextProductInRoomOrganizedFurnitureStore(Room room) {
		Furniture furniture = null;
		if (this.floorIterators.get(room.ordinal()).hasNext()) {
			furniture = this.floorIterators.get(room.ordinal()).next();
			printer.printMessageLevel2(furniture.getName() + "\t(customer)");
		}
		return furniture;
	}

	private boolean hasMoreProductsInRoomOrganizedFurnitureStore(Room room) {
		return this.floorIterators.get(room.ordinal()).hasNext();
	}

	private Furniture nextProductInSizeOrganizedFurnitureStore(FurnitureStore furnitureStore, Room room) {
		Furniture furniture = null;
		for (int floor = 0; floor < furnitureStore.getFloors().size(); floor++) {
			if (this.floorIterators.get(floor).hasNext()) {
				furniture = this.floorIterators.get(floor).next();
				if (furniture.getRoom() == room) {
					printer.printMessageLevel2(furniture.getName() + "\t(customer)");
					return furniture;
				}
			}
		}
		return furniture;
	}

	private boolean hasMoreProductsInSizeOrganizedFurnitureStore(FurnitureStore furnitureStore, Room room) {
		boolean hasMore = false;
		for (int floor = 0; floor < furnitureStore.getFloors().size(); floor++) {
			hasMore = hasMore || this.floorIterators.get(floor).hasNext();
		}
		return hasMore;
	}
}
