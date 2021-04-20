package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {


		List<Integer> oddNums= List.of(1,3,5);
		List<Integer> evenNums=List.of(2,4,6);
		List<List<Integer>>intNums=Arrays.asList(oddNums,evenNums);
		System.out.println("Before flattening: \n"+intNums);
		
		System.out.println("After flattening: ");
		List<Integer>numbers=intNums.stream()
		.flatMap(list->list.stream())
		.collect(Collectors.toList());
		System.out.println(numbers);
		
		//the odd numbers
				Stream odds = Stream.iterate(1, n -> n + 2);
				//odds.collect(Collectors.toList());
				List<Integer> list = Stream.iterate(1, n -> n + 2)
						             .limit(4).skip(8)
						             .collect(Collectors.toList());
				System.out.println(list);
				
				List<Integer> ints = Arrays.asList(3,5,2,3,8);
				List<int[]> intArrs = ints.stream()
						                  .map(int[]::new)
						                  .collect(Collectors.toList());
				List<String> intArrsStr = intArrs.stream()
					
						                         .map(Arrays::toString)
						                         .collect(Collectors.toList());
				System.out.println(intArrsStr);
				
		

	}

}
