package exam10;

import java.util.HashMap;
import java.util.Scanner;


public class ShipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <String, Object>map = new HashMap<String, Object>();
		Scanner in = new Scanner(System.in);
		
		
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
	System.out.print("운항 할 거리를 입력하시오: ");
		int sail = 0;
		sail = in.nextInt();
	
		
		for (int i = 1; i < 3; i++) {
			((Ship)map.get(i+"")).sail(sail);;
		}
		
		
	System.out.println();
	System.out.println("shipName" + "\tfuelTank");
	System.out.println("--------------------------");
		
		for (int i = 1; i < 3; i++) {
			System.out.println(map.get(i+""));
		}
		
	System.out.println();
	System.out.print("주유할 양을 입력하시오: ");
		int fuel = 0;
		fuel = in.nextInt();
	
		for (int i = 1; i < 3; i++) {
			((Ship)map.get(i+"")).refuel(fuel);
		}
		
	System.out.println();
	System.out.println("shipName" + "\tfuelTank");
	System.out.println("--------------------------");
		
		for (int i = 1; i < 3; i++) {
			System.out.println(map.get(i+""));
		}
	}
}
