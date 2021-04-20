package comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	
	public void sort(List<Employee> emps, final SortMethod method) {
				
		Comparator<Employee> lambda1=(Employee e1,Employee e2)->{
			
			if(method==SortMethod.BYNAME) 
				return e1.name.compareTo(e2.name);
			else 
				throw new IllegalArgumentException("Cannot Compare!");
		};
		
		Collections.sort(emps, lambda1);
	}
	
	public static void main(String[] args) {
		
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		
	}
}
