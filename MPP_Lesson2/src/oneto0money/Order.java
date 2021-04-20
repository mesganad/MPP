package oneto0money;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private LocalDate orderDate;
	private List<Item> items;
	
	Order(LocalDate orderDate){
		items=new ArrayList<>();
		this.orderDate=orderDate;
	}
	
	
	
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void addItem(String name){
		Item it=new Item(name);
		items.add(it);
	}
	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}

}
