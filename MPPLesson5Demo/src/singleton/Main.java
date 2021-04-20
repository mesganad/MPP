package singleton;

public class Main {
	public static void main(String[] args) {
		
		Address address=Address.getNewAddress("Fairfield");
		
		System.out.println(address.getCity());
		
		Address address2=Address.getNewAddress("Chicago");
		System.out.println(address2.getCity());
	}

}
