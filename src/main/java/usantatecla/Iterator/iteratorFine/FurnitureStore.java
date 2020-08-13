package usantatecla.Iterator.iteratorFine;

import java.util.ArrayList;

import usantatecla.Utils.utils.Printer;

public abstract class FurnitureStore {

	private static final int NUMBER_OF_FLOORS = 3;

	protected Printer printer = Printer.getInstance();

	protected ArrayList<Floor> floors;
	protected ArrayList<Furniture> furniture;

	protected FurnitureStore() {
		this.floors = new ArrayList<Floor>(NUMBER_OF_FLOORS);
		this.furniture = new ArrayList<Furniture>();

		this.furniture.add(new Furniture("Couch1", Furniture.Room.LIVINGROOM, Furniture.Size.LARGE));
		this.furniture.add(new Furniture("Wallunit1", Furniture.Room.LIVINGROOM, Furniture.Size.LARGE));
		this.furniture.add(new Furniture("Couch2", Furniture.Room.LIVINGROOM, Furniture.Size.MEDIUM));
		this.furniture.add(new Furniture("Diningtable1", Furniture.Room.LIVINGROOM, Furniture.Size.MEDIUM));
		this.furniture.add(new Furniture("Bookcase1", Furniture.Room.LIVINGROOM, Furniture.Size.MEDIUM));
		this.furniture.add(new Furniture("Bookcase2", Furniture.Room.LIVINGROOM, Furniture.Size.SMALL));
		this.furniture.add(new Furniture("Coffeetable1", Furniture.Room.LIVINGROOM, Furniture.Size.SMALL));

		this.furniture.add(new Furniture("Doublebed1", Furniture.Room.BEDROOM, Furniture.Size.LARGE));
		this.furniture.add(new Furniture("Bunkbed1", Furniture.Room.BEDROOM, Furniture.Size.LARGE));
		this.furniture.add(new Furniture("Wardrobe1", Furniture.Room.BEDROOM, Furniture.Size.LARGE));
		this.furniture.add(new Furniture("Wardrobe2", Furniture.Room.BEDROOM, Furniture.Size.MEDIUM));
		this.furniture.add(new Furniture("Chiffonier1", Furniture.Room.BEDROOM, Furniture.Size.MEDIUM));
		this.furniture.add(new Furniture("NightStand1", Furniture.Room.BEDROOM, Furniture.Size.SMALL));
		this.furniture.add(new Furniture("Mirror1", Furniture.Room.BEDROOM, Furniture.Size.SMALL));

		this.furniture.add(new Furniture("Pergola1", Furniture.Room.GARDEN, Furniture.Size.LARGE));
		this.furniture.add(new Furniture("Picnictable1", Furniture.Room.GARDEN, Furniture.Size.LARGE));
		this.furniture.add(new Furniture("Picnictable2", Furniture.Room.GARDEN, Furniture.Size.MEDIUM));
		this.furniture.add(new Furniture("Bench1", Furniture.Room.GARDEN, Furniture.Size.MEDIUM));
		this.furniture.add(new Furniture("Bench2", Furniture.Room.GARDEN, Furniture.Size.SMALL));
		this.furniture.add(new Furniture("Swingseat1", Furniture.Room.GARDEN, Furniture.Size.SMALL));
		this.furniture.add(new Furniture("Deckchair1", Furniture.Room.GARDEN, Furniture.Size.SMALL));
	}

	protected void addFloor(Floor floor) {
		if (this.floors.size() < NUMBER_OF_FLOORS)
			this.floors.add(floor);
	}

	protected abstract void distributeFurnitureInFloors();

	public ArrayList<Floor> getFloors() {
		return this.floors;
	}

	public ArrayList<Furniture> getFurniture() {
		return furniture;
	}

	public abstract ShopAssistant createShopAssistant();

	@Override
	public String toString() {
		String furnitureList = "";
		for (Floor floor : this.getFloors()) {
			furnitureList += "Floor " + floor.getFurnitureType() + " [" + floor.toString() + "] \n";
		}
		return furnitureList;
	}
}
