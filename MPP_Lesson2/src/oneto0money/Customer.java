package oneto0money;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {

	private List<Order> orders;
	private String name;
	
	public Customer(String name) {
		this.name=name;
		orders=new ArrayList<>();
	}
	
	public Order addOrder(LocalDate orderDate) {
		Order order=new Order(orderDate);
		orders.add(order);
		return order;
	}
	
	public List<Order> getOrder(){
		return orders;
	}
}
