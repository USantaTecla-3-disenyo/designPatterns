package usantatecla.Iterator.iteratorWrong;

public class SizeOrganizedFurnitureStore extends FurnitureStore {

	public SizeOrganizedFurnitureStore() {
		super();
		this.addFloor(new Floor(Furniture.Size.SMALL.ordinal()));
		this.addFloor(new Floor(Furniture.Size.MEDIUM.ordinal()));
		this.addFloor(new Floor(Furniture.Size.LARGE.ordinal()));
		this.distributeFurnitureInFloors();
		printer.printMessageLevel1("Created furniture store with floors organized by sizes: \n" + this.toString());
	}

	@Override
	protected void distributeFurnitureInFloors() {
		for (Furniture f : this.getFurniture()) {
			if (f.getSize() == Furniture.Size.SMALL) {
				this.getFloors().get(Furniture.Size.SMALL.ordinal()).addFurniture(f);
			} else if (f.getSize() == Furniture.Size.MEDIUM) {
				this.getFloors().get(Furniture.Size.MEDIUM.ordinal()).addFurniture(f);
			} else if (f.getSize() == Furniture.Size.LARGE) {
				this.getFloors().get(Furniture.Size.LARGE.ordinal()).addFurniture(f);
			}
		}
	}
}
