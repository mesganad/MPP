package factoryPatternExample2;

public class ProductFactory {
	public static Product createProduct(String productType) {
		if(productType==null) {
			throw new IllegalArgumentException("product type cannot be null");
		}
		if("Milk".equalsIgnoreCase(productType)) {
			return new Milk(50);
		}
		else if ("Sugar".equalsIgnoreCase(productType)) {
			return new Sugar(25);
		}
		else
			return null;
			
	}

}
