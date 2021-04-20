package lab3Prob4;

public class Condominium extends Property {

	private String name;
	Address address;
		private int numberOfFloors;
		
		public Condominium(int numberOfFloors, String name) {
			this.numberOfFloors = numberOfFloors;
			address=new Address();
			this.name=name;
		}

		public Address getAddress() {
			return address;
		}
		public double computeRent(){
			return 500 * numberOfFloors;
		}
	}


