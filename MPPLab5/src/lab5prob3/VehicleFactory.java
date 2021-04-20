package lab5prob3;

public class VehicleFactory {

	public static Vehicle getVehicle(String v) {
		Vehicle vehicle;
		if(v==null) {
			throw new IllegalArgumentException("vehicle type cannot be null");
		}
		switch(v)
		{
		case "Bus":
			 vehicle= new Bus();
			break;
			
		case"Truck":
			 vehicle=new Truck();
			break;
		case"Car":
			 vehicle= new Car();
			break;
		case"ElectricCar":
			 vehicle= new ElectricCar();
			break;
		
		default:
			return null;
	}
		return vehicle;
}
}