package problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	
	public static void main(String[] args) {
		
		List<Double>list =new ArrayList<>();
		//BiFunction interface has unimplemented method that takes two values and returns a value.
		BiFunction<Double,Double,List<Double>> f=
				(x,y)->{
					list.add(Math.pow(x, y));
					list.add(x*y);
					return list;
				};
				
			System.out.println(f.apply(2.0, 3.0));	
		

	}

}
