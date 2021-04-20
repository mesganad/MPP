package lab3Prob4;

public class Trailer extends Property {
 private final double rent = 500;
 Address address;
 public String name;
	public Trailer(String name) {
		this.name=name;
		address=new Address();
	}
	
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public double computeRent(){
		return rent;
	}
}
