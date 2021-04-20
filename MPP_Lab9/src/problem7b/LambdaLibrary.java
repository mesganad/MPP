package problem7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	public static final TriFunction<List<Employee>,Integer,Character,String> FULL_NAME=
			(empList,salaryLimit,letter)->
				empList.stream()
				.filter(e->(e.getSalary()>salaryLimit))
				.filter(e->(e.getLastName().charAt(0)>letter))
				.map(e->e.getFullName(e))
				.sorted()
				.collect(Collectors.joining(","));

}
