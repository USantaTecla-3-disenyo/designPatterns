package usantatecla.Iterator.iteratorFine;

import usantatecla.Iterator.iteratorFine.Furniture.Room;

public class RoomOrganizedShopAssistant extends ShopAssistant {

	public RoomOrganizedShopAssistant(FurnitureStore furnitureStore) {
		super(furnitureStore);
	}

	
	public Furniture nextProduct(Room room) {
		Furniture furniture = null;
		if (this.floorIterators.get(room.ordinal()).hasNext()) {
			furniture = this.floorIterators.get(room.ordinal()).next();
			printer.printMessageLevel2(furniture.getName() + "\t(roomOrganizedShopAssistant)");
		}
		return furniture;
	}

	
	public boolean hasMoreProducts(Room room) {
		return this.floorIterators.get(room.ordinal()).hasNext();
	}
}
