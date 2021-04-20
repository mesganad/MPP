package prob2B;

public class OrderLine {
	private int lineNum;
	private double price;
	private int quantity;
	private Order order;
	OrderLine(int lineNum, double price, int quantity, Order order) {
		this.lineNum = lineNum;
		this.price = price;
		this.quantity = quantity;
		this.order = order;
	}
	public Order getOrder() {
		return order;
	}
	public int getLineNum() {
		return lineNum;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return  "OrderLine [ linenum = " + lineNum + ",price = " + price + ",quantity = "+ quantity +"]";
	}
}
