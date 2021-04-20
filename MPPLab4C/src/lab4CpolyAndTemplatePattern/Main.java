package lab4CpolyAndTemplatePattern;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Order> list = new ArrayList<>();
		list.add(new Order("100",LocalDate.of(2021, 2, 1), 300));
		list.add(new Order("100",LocalDate.of(2021, 2, 10), 150));
		Commissioned cm = new Commissioned("123", 0.8, 500, list);
		Employee[] emp = { new Salaried("121", 5000), new Hourly("122", 15.67, 20), cm };
		for (Employee e : emp) {
			e.print(); //passing current month and year manually
		}
	}
}