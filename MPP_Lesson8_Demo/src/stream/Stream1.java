package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Stream1 {

	public static void main(String[] args) {
		/*
		 * //collections.stream List<Integer> list=Arrays.asList(1,2,3,4,5); int
		 * sum=list.stream() .filter(x->x%2==1) .map(x->x*x) .reduce(0,(x,y)->x+y);
		 * System.out.println(sum);
		 */
		
		List<String> strList=Arrays.asList("Misgan","Maya","Magi","Asmamaw");
		List<String> strList2=new ArrayList<>();
		StreamExample1 str=new StreamExample1();
		strList2=str.findStartsWithLetter(strList, "M");
		System.out.println(strList2);
		
		
		//Method reference--ClassMethod
		BiFunction<Integer,Integer,Double>f=
				//(x,y)->Math.pow(x,y);
				Math::pow;
				
		System.out.println("The result is: "+f.apply(5, 2));
		
		
		BiConsumer<Integer,Integer>f1=
		(x,y)->System.out.println(x+" and "+y);
		f1.accept(4, 3);
		
		//predicate functional interface
		Predicate<String> p=
		(x)->x.equals("Misgan");
		System.out.println(p.test("Misgan"));
		
		
		
		
		
	}

}
