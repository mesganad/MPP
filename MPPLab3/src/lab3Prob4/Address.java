package lab3Prob4;

public class Address extends Property {
	private String city;
	private String state;
	private String zipCode;
	private String street;

	
	
	public Address() {
		
	}
	public void setAddress(String city, String state, String zipCode,String street) {
		this.city=city;
		this.state=state;
		this.zipCode=zipCode;
		this.street=street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getStreet() {
		return street;
	}
	@Override
	 double computeRent() {
		return 0.0;
	}
	@Override
	Address getAddress() {
		// TODO Auto-generated method stub
		return this;
	}
	
public String toString() {
	return city+","+state+","+street;
}
}
