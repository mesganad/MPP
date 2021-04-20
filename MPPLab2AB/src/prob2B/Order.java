package prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Implementing one to many bidirectional association
public class Order {
	private LocalDate orderDate;
	private int orderNum;
	private List<OrderLine> orderLines;

	public Order(int orderNum,LocalDate orderDate, int lineNum, double price, int quantity) {
		this.orderDate = orderDate;
		this.orderNum=orderNum;
		orderLines = new ArrayList<>();
		addOrderLine(lineNum, price, quantity);

	}

	public void addOrderLine(int lineNum, double price, int quantity) {
		OrderLine orderLine=new OrderLine(lineNum, price, quantity, this);
		orderLines.add(orderLine);
	}

	public int getOrderNum() {
		return orderNum;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public List<OrderLine> getOrderLine() {
		return orderLines;
	}
	@Override
	public String toString() {
		
		String myOrder = "Order number"+orderNum+"[";
		for (OrderLine o : orderLines) {
			myOrder += o.toString() + "\n";

		}
		return myOrder;
	}
}
