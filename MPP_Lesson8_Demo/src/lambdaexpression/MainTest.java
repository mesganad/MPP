package lambdaexpression;

import java.util.Random;
import java.util.function.BiFunction;

public class MainTest {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> bf=(x,y)->2*x-y;
		System.out.println(bf.apply(5, 6));
		
		
		TriFunction<Double,Double,Double,Double> add=(x,y,z)->x+y+z;
		System.out.println(add.apply(2.2,2.2,3.3));
		
		RandomNum rn=()->{
			Random r=new Random();
			return r.nextInt();
		};

	System.out.println(rn.produce());
	}


	

}
