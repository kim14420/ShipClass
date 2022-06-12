package exam10;

public class Boat extends Ship {

	public Boat () {
		
	}
	
	public Boat (String shipName, int fuelTank) {
		super (shipName, fuelTank);
		
	
	}
	
	public void sail (int dist) {
		setFuelTank(getFuelTank() - (dist * 10));
		
		
	}
	
	public void refuel (int fuel) {
		setFuelTank(getFuelTank() + (fuel * 10));
	}

	@Override
	public String toString() {
		return getShipName() + "\t\t" + getFuelTank();
	}

	


	
}


