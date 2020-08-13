package usantatecla.Iterator.iteratorFine;

import usantatecla.Iterator.iteratorFine.Furniture;
import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();
		printer.printTitle("ITERATOR FINE");

		FurnitureStore roomOrganizedfurnitureStore = new RoomOrganizedFurnitureStore();
		FurnitureStore sizeOrganizedfurnitureStore = new SizeOrganizedFurnitureStore();
		Customer customer = new Customer();

		printer.printSubTitle("CUSTOMER ASKING FOR BEDROOM FURNITURE IN A ROOM ORGANIZED FURNITURE STORE");
		customer.buyRoomFurniture(roomOrganizedfurnitureStore, Furniture.Room.BEDROOM);

		printer.printSubTitle("CUSTOMER ASKING FOR LIVINGROOM FURNITURE IN A ROOM ORGANIZED FURNITURE STORE");
		customer.buyRoomFurniture(roomOrganizedfurnitureStore, Furniture.Room.LIVINGROOM);

		printer.printSubTitle("CUSTOMER ASKING FOR GARDEN FURNITURE IN A ROOM ORGANIZED FURNITURE STORE");
		customer.buyRoomFurniture(roomOrganizedfurnitureStore, Furniture.Room.GARDEN);

		printer.printSubTitle("CUSTOMER ASKING FOR BEDROOM FURNITURE IN A SIZE ORGANIZED FURNITURE STORE");
		customer.buyRoomFurniture(sizeOrganizedfurnitureStore, Furniture.Room.BEDROOM);

		printer.printSubTitle("CUSTOMER ASKING FOR LIVINGROOM FURNITURE IN A SIZE ORGANIZED FURNITURE STORE");
		customer.buyRoomFurniture(sizeOrganizedfurnitureStore, Furniture.Room.LIVINGROOM);

		printer.printSubTitle("CUSTOMER ASKING FOR GARDEN FURNITURE IN A SIZE ORGANIZED FURNITURE STORE");
		customer.buyRoomFurniture(sizeOrganizedfurnitureStore, Furniture.Room.GARDEN);
	}
}