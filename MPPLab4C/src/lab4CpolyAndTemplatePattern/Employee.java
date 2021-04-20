package lab4CpolyAndTemplatePattern;

import java.time.LocalDate;

abstract public class Employee {
	private  String empId;

	public Employee(String empId) {
		this.empId = empId;
	}

	public void print() {
		LocalDate curDate=LocalDate.now();
		System.out.println(calcCompensation(curDate.getMonthValue(), curDate.getYear()));  
	}

	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(empId,grossPay, Tax.FICA, Tax.State, Tax.Local, Tax.Medicare, Tax.SocialSecurity);
	}

	abstract public double calcGrossPay(int month, int year);
}
