package factoryPatternExample2;

public class Milk extends Product {

private double price;
	
	protected Milk(double price) {
		this.price=price;
	}
	
	
	@Override
	public String getProductType() {
		return "Milk";
	}
	@Override
	public double getPrice() {
		return price;
	}
}
