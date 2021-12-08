package B_com.after.implementing.builder.example;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Samarth Narula
 */
public class Architect {

	public static void main(String[] args) {
		
//		Bedroom room3 = new Bedroom();
//		room3.setCeilingHeight(50);
//		room3.setNumberOfDoors(2);
//		System.out.println("Room 3 with normal java set methods: " + room3);
//		System.out.println();
		
//		Bedroom room = new BedroomBuilder().setDimensions(new Dimension(200, 100)).setCeilingHeight(3).setFloorNumber(2)
//				.setWallColor(Color.WHITE).setNumberOfWindows(2).setNumberOfDoors(1).setHasEnsuite(false)
//				.createBedroom();
//		System.out.println("Room " + room.toString());
//		System.out.println();
		
//		Bedroom room2 = new BedroomBuilder().setFloorNumber(2).setWallColor(Color.WHITE).setNumberOfWindows(2)
//				.setNumberOfDoors(1).setHasEnsuite(false).createBedroom();
//		System.out.println("Room 2: "+ room2.toString());
//		System.out.println();

//		Bedroom allArgsRoom = new Bedroom(new Dimension(200, 100), 132, 2, Color.yellow, 2, 1, true);
//		System.out.println("allArgsRoom: " + allArgsRoom.toString());
//		System.out.println();
		
		// When To Use Telescoping Pattern
//		Bedroom telescopingRoom = new Bedroom(new Dimension(200, 100), 132, 2);
//		System.out.println("telescopingRoom: " + telescopingRoom.toStringForTelescopingPattern());
//		System.out.println();
		
		// Builder inside Builder
		Bedroom bedRoomWithATv = new BedroomBuilder().setDimensions(new Dimension(200, 100)).setCeilingHeight(3)
				.setFloorNumber(2).setWallColor(Color.WHITE).setNumberOfWindows(2).setNumberOfDoors(1)
				.setHasEnsuite(false)
				.setTv(new TvBuilder().setBrand("Philips").setServiceProvider("DISH TV").createTv()).createBedroom();
		System.out.println("bedRoomWithATv " + bedRoomWithATv.toString());
	}

}
