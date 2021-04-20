package extpackage;

import java.time.LocalDate;

import oneto0money.Customer;
import oneto0money.Order;


public class MainOrderItem {

	public static void main(String[] args) {
		Customer cust=new Customer("Misgan");
		Order order=cust.addOrder(LocalDate.now());
		
		order.addItem("shirt");
		order.addItem("laptop");
		
		Order order2=cust.addOrder(LocalDate.now());
		order2.addItem("car");
		order2.addItem("jacket");
		System.out.println(cust.getOrder());

	}

}
