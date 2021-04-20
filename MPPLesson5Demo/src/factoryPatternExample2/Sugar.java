package factoryPatternExample2;

public class Sugar extends Product {

	private double price;
	
	protected Sugar(double price) {
		this.price=price;
	}
	
	@Override
	public String getProductType() {
		return "Sugar";
	}
	@Override
	public double getPrice() {
		return price;
	}
}
