package iterate;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Examples {

	public static void main(String[] args) {
		Stream<String> stream0 = Stream.generate(() -> "Echo ");
		Stream<BigInteger> stream1 = 
			Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE));
		
		Stream<Integer> stream2 =
			Stream.iterate(1, n -> n + 1);
		
		stream0.limit(5).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println("\n");
		stream1.limit(5).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println("\n");
		stream2.limit(5).collect(Collectors.toList()).forEach(System.out::print);
	
	List<Integer> ints=Arrays.asList(2,3);
	ints.stream().map(x->x.toString()).collect(Collectors.toList());
	System.out.println(ints);
	}

}
