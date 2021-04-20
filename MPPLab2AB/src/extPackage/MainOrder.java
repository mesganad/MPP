package extPackage;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import prob2B.Order;

public class MainOrder {

	public static void main(String[] args) {
		Order order1 = new Order(1,LocalDate.of(2012, 2, 5), 1, 23.00, 4);
		order1.addOrderLine(2, 17.50, 1);
		Order order2 = new Order(2,LocalDate.of(2013, 4, 15), 1, 13.00, 2);
		order2.addOrderLine(2, 19.50, 1);
		
		List<Order> orders = Arrays.asList(order1, order2);
		System.out.println(orders);
		
		

	}

}
