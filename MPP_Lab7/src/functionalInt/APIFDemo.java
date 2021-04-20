package functionalInt;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class APIFDemo {
	public static void main(String[] args) {
		BiFunction<Integer,Float,Float> fun1=(x,y)->2*x-y;
		Float x=fun1.apply(12, 12.5f);
		System.out.println(x);
	

	//TriFunction<double,double,double> tri=(x,y,z)->2x+3y-z;
	
	List<Integer> numbers=Arrays.asList(5,6,7,9);
	
	numbers.forEach(number->System.out.print(number+" ")
	);
	System.out.println("\n");
	numbers.forEach(System.out::print);
		
	int factor=2;
	System.out.println(numbers.stream().filter(number->number%2==0).mapToInt(e->e*factor).sum());
	//factor=3;
	/*
	 * Function(Double,Double) m=(x)->1.6*x; System.out.println();
	 */	
		
	}

}
