package factoryPatternExample2;

public class Shopper {

	public static void main(String[] args) {


		Product pro=ProductFactory.createProduct("Milk");
		double price=pro.getPrice();
		String productType=pro.getProductType();
		System.out.println("Price of "+productType+": "+price);

	}

}
