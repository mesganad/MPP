package lab5prob3;

public class App {

	public static void main(String[] args) {


		Vehicle newVehicle=VehicleFactory.getVehicle("ElectricCar");
		newVehicle.startEngine();

	}

}
