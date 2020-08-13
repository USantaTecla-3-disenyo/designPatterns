package usantatecla.Iterator.iteratorFine;

public class RoomOrganizedFurnitureStore extends FurnitureStore {

	public RoomOrganizedFurnitureStore() {
		super();
		this.addFloor(new Floor(Furniture.Room.LIVINGROOM.ordinal()));
		this.addFloor(new Floor(Furniture.Room.BEDROOM.ordinal()));
		this.addFloor(new Floor(Furniture.Room.GARDEN.ordinal()));
		this.distributeFurnitureInFloors();
		printer.printMessageLevel1("\nCreated furniture store with floors organized by rooms: \n" + this.toString());
	}

	@Override
	protected void distributeFurnitureInFloors() {
		for (Furniture f : this.getFurniture()) {
			if (f.getRoom() == Furniture.Room.LIVINGROOM) {
				this.getFloors().get(Furniture.Room.LIVINGROOM.ordinal()).addFurniture(f);
			} else if (f.getRoom() == Furniture.Room.BEDROOM) {
				this.getFloors().get(Furniture.Room.BEDROOM.ordinal()).addFurniture(f);
			} else if (f.getRoom() == Furniture.Room.GARDEN) {
				this.getFloors().get(Furniture.Room.GARDEN.ordinal()).addFurniture(f);
			}
		}
	}

	@Override
	public ShopAssistant createShopAssistant() {
		printer.printMessageLevel1("Shop assistant provided to the customer (roomOrganizedFurnitureStore)\n");
		return new RoomOrganizedShopAssistant(this);
	}
}
