package singleton;

public class Address {
	private static Address addr1=null;
	private String city;
	
	private Address(String city) {
		this.city=city;
	}
	
	public static Address getNewAddress(String city) {
		if(addr1==null) {
			addr1=new Address(city);
			
		}
		return addr1;
	}

	public String getCity() {
		return city;
	}
	
}
