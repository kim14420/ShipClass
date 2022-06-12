package exam10;

public class Cruise extends Ship {

	public Cruise () {
		
	}
	
	public Cruise (String shipName, int fuelTank) {
		super(shipName, fuelTank);
	
	}
	
	public void sail (int dist) {
		setFuelTank(getFuelTank() - (dist * 13));
	}
	
	public void refuel (int fuel) {
		setFuelTank(getFuelTank() + (fuel * 8));
	}

	@Override
	public String toString() {
		return getShipName() + "\t\t" + getFuelTank();
	}

	
	

}

