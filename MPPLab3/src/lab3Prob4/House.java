package lab3Prob4;

public class House extends Property {

	public String name;
	Address address;
	private double lotSize;
	
	public House(double lotSize, String name) {
		this.lotSize = lotSize;
		address=new Address();
		this.name=name;
	}

	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}

	public double computeRent(){
		return 0.1 * lotSize;
	}
	
	
}
