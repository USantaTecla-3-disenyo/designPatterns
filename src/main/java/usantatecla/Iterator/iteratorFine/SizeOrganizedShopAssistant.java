package usantatecla.Iterator.iteratorFine;

import usantatecla.Iterator.iteratorFine.Furniture.Room;

public class SizeOrganizedShopAssistant extends ShopAssistant {

	public SizeOrganizedShopAssistant(FurnitureStore furnitureStore) {
		super(furnitureStore);
	}

	@Override
	public Furniture nextProduct(Room room) {
		Furniture furniture = null;
		for (int floor = 0; floor < this.furnitureStore.getFloors().size(); floor++) {
			if (this.floorIterators.get(floor).hasNext()) {
				furniture = this.floorIterators.get(floor).next();
				if (furniture.getRoom() == room) {
					printer.printMessageLevel2(furniture.getName() + "\t(sizeOrganizedShopAssistant)");
					return furniture;
				}
			}
		}
		return furniture;
	}

	@Override
	public boolean hasMoreProducts(Room room) {
		boolean hasMore = false;
		for (int floor = 0; floor < this.furnitureStore.getFloors().size(); floor++) {
			hasMore = hasMore || this.floorIterators.get(floor).hasNext();
		}
		return hasMore;
	}
}
