package professorDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;

public class TestSlideCodeStreamAPI {
	
	 

	   public static Optional<Double> inverse(Double x) {
		     return x == 0 ? Optional.empty() : Optional.of(1/x);
		   }
	   
	   // Make Stream Reuse - Approach 1 : Make a method to return a Streams
	   
	   public static Stream<String> namesStream(List<String> list){
		    return list.stream();
	   }
	public static void main(String[] args) {
		
		// Stream Reuse
		List<String> names = new ArrayList<>(Arrays.asList("Java",
				"C++","Android","Angular","Html","Kotlin"));
		// 1. Stream Resue by calling GetStream method	
		
		long c = namesStream(names)
				.filter(x->x.startsWith("A"))
				.count();
		System.out.println(c);
		
		Optional<String> res = namesStream(names)
				.filter(x->x.startsWith("A"))
				.findFirst();
		
		System.out.println(res.get());
		
		// Resuse - Approach 2 - Use Suitable Functional Ibterface - Lambda Library
		
		Stream<String> col1 = MyLambdaLibrary.FILTERNAMES.apply(names, "A");
		System.out.println(col1.findFirst().get());
	/*	Stream<String> sw = names.stream()
				.filter(x->x.startsWith("A"));*/
		// Applied the collect terminal operation
	//	System.out.println(sw.collect(Collectors.toList()));
		// Streams cannot reuse once you applied the terminal operation
	//	System.out.println(sw.count()); // You will illegalStateException
				
				
		// Optional Demo
		
	/*	Optional<Double> iv = inverse(0.0);
		System.out.println("Inverse of " + iv);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		// To find the max
	OptionalInt m = 	numbers.stream()
		.mapToInt(x->x.intValue())
		.max();
	 System.out.println(m.getAsInt());
		
		List<String> names = new ArrayList<>(Arrays.asList("Java",
				"C++","Android","Angular","Html","Kotlin"));
		
		// Task : Find the first element starts with A
		Optional<String> fir = names.stream()
		.filter(x->x.startsWith("B"))
		.findFirst();
		
		//System.out.println(fir.get()); // will give Exception NoSuchElement
		// 1. Approach isPresent() - To avoid exception check as below
		
		if(fir.isPresent()) {
			System.out.println(fir.get());
		}
		else
			System.out.println("No such element found");
		
		
		//2. Approach
		//ob.orElse(val) - if the result present print the value or else print value on the orElse argument
		System.out.println(fir.orElse("No such match"));
		
		
		//3. IfPresent(Consumer) - If present some action or else nothing
		
		fir.ifPresent(x->System.out.println(x + " first match"));
		
		//4. ofNullable()
		String name = null;
		String gre  = " Good Evening";
		 gre = Optional.ofNullable(name) + gre;
		System.out.println(gre);
	
		// 5. orElseGet - If the input null return random number from math class not return original value
		Optional<Double> x = Optional.ofNullable(null);
		System.out.println(x.orElseGet(Math::random));*/
	
		
		// TODO Auto-generated method stub
	/*	List<String> list = new ArrayList();
		list.add("Red");
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Black");
		//Without Duplicates
		
		Stream<String> res = list.stream().distinct();
		res.forEach(System.out::println);
		
		 // Sorted order.
		list.stream().distinct().sorted().forEach(x->System.out.print(x + " "));
		 
		List<String> words = Arrays.asList("Tom", "Joseph", "Richard");
	Stream<String> longestFirst  
	     = words.stream()
	     .sorted((String x, String y) -> y.length()-x.length());
	System.out.println(longestFirst.collect(Collectors.toList()));

	// Improved version of comparator in functional way
	
	Function<String,Integer> fun = x -> x.length();
	// Reuse the captured Function interface
	System.out.println("Print reversed order using Comparator.comparing");
	words.stream().sorted(Comparator.comparing(fun).reversed())
	.forEach(System.out::println);
		
	System.out.println("Print reversed order using Comparator.comparing Method reference");
	words.stream().sorted(Comparator.comparing(String::length).reversed())
	.forEach(System.out::println);
	
	
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	// Sum the squared values of Odd numbers
	// Call collection. stream
	int sum = numbers.stream()   //1. Create Stream
	.filter(x-> x%2==1) // 2. Apply Intermediate filter - Predicate
	.map(x->x*x)        // 2. Apply Intermediate map   - Function
	.reduce(0,(x,y)->x+y); // 3. terminal operation
	System.out.println(sum);
	
	BinaryOperator<Integer> obj = (x,y) -> x+y;
	System.out.println("Sum x and y " + obj.apply(10, 20)); */
	
		/*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		// Sum the squared values of Odd numbers
		// Call collection. stream
		int sum = numbers.stream()   //1. Create Stream
		.filter(x-> x%2==1) // 2. Apply Intermediate filter - Predicate
		.map(x->x*x)        // 2. Apply Intermediate map   - Function
		.reduce(0,(x,y)->x+y); // 3. terminal operation
		System.out.println(sum);
		
		 sum = Stream.of(1,2,3,4,5,6)
				 .filter(x-> x%2==0) // 2. Apply Intermediate filter - Predicate
					.map(x->x*x)        // 2. Apply Intermediate map   - Function
					.reduce(0,(x,y)->x+y); // 3. terminal operation
					System.out.println(sum);
		
		// Generate Infinite stream and limit 10  random values
			
		Stream.generate(Math::random) // Supplier for generate method
		.limit(10)
		.forEach(System.out::println);
		
		// Print 1 to 10 numbers on the console
		Stream<Integer> list1 = Stream.iterate(1,x->x+1);
		
		list1
		.skip(5)
		.limit(10)
		
		.forEach(x->System.out.println(x));*/
		
	/*	List<String> l1 = Arrays.asList("Red","Pink","Black","Blue","Brown");
		List<String> l2 = Arrays.asList("Java","Design Pattern","Data Structures");
		Stream.concat(l1.stream(), l2.stream())
		.forEach(System.out::println);*/
		
	}
	
}