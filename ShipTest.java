package exam10;

import java.util.HashMap;


public class ShipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap <String, Object>map = new HashMap<String, Object>();
	
	Boat boat1 = new Boat();
	boat1.setShipName("Boat01");
	boat1.setFuelTank(500);
	
	map.put("1", boat1);
	
	Cruise cruise1 = new Cruise();
	cruise1.setShipName("Cruise01");
	cruise1.setFuelTank(1000);
	
	map.put("2", cruise1);
	
	System.out.println("shipName" + "\tfuelTank");
	System.out.println("--------------------------");
	
	for (int i = 1; i < 3; i++) {
		System.out.println(map.get(i+""));
	}
	
	System.out.println();
	System.out.println("10운항");
	System.out.println("shipName" + "\tfuelTank");
	System.out.println("--------------------------");


	for (int i = 1; i < 3; i++) {
		((Ship)map.get(i+"")).sail(10);;
	}
	
	for (int i = 1; i < 3; i++) {
		System.out.println(map.get(i+""));
	}
	
	System.out.println();
	System.out.println("5주유");
	System.out.println("shipName" + "\tfuelTank");
	System.out.println("--------------------------");


	for (int i = 1; i < 3; i++) {
		((Ship)map.get(i+"")).refuel(5);
	}
	
	for (int i = 1; i < 3; i++) {
		System.out.println(map.get(i+""));
	}
	}
}
