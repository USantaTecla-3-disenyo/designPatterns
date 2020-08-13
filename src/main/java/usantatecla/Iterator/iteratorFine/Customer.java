package usantatecla.Iterator.iteratorFine;

import usantatecla.Iterator.iteratorFine.Furniture.Room;
import usantatecla.Utils.utils.Printer;

public class Customer {

	private Printer printer = Printer.getInstance();

	public void buyRoomFurniture(FurnitureStore furnitureStore, Room room) {
		printer.printMessageLevel1("Looking for all " + room.name() + " furniture (customer)\n");
		ShopAssistant shopAssistant = furnitureStore.createShopAssistant();
		while (shopAssistant.hasMoreProducts(room)) {
			shopAssistant.nextProduct(room);
		}
	}
}
