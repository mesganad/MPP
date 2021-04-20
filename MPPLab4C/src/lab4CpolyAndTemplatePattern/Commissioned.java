package lab4CpolyAndTemplatePattern;

import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(String empId, double commission, double baseSalary, List<Order> orders) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders=orders;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		LocalDate startOfCurrentMonth = LocalDate.of(year, month, 1);
		double orderAmountsThisMonth = 0.0;
	
		for (Order order : orders) {
			if (isPreviousMonth(startOfCurrentMonth, order.getOrderDate())) {
				orderAmountsThisMonth += order.getOrderAmount();
			}
		}
		
		return baseSalary + commission * orderAmountsThisMonth;
	}

	private boolean isPreviousMonth(LocalDate current, LocalDate Previous) {
		int currMonth = current.getMonthValue();
		int prevMonth = Previous.getMonthValue();
		int currYear = current.getYear();
		int prevYear = Previous.getYear();
		if ((currMonth - prevMonth == 1 && currYear == prevYear)
				|| (currMonth == 1 && prevMonth == 12 && currYear - prevYear == 1)) {
			return true;
		}
		return false;
	}
}
