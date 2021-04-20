package problem2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallest<T> {

	public static <T extends Comparable<? super T>> T secondMin(List<T> list) {
		List<T>newList=list.stream().distinct().sorted().collect(Collectors.toList());
		T secondSmall=newList.get(1);
		
		return secondSmall;
	}
	public static void main(String[] args) {
		List<Integer> ints=Arrays.asList(1,2,2,3,4,5);
		System.out.println("Second smallest integer is: "+secondMin(ints));
		
		List<String> strings=Arrays.asList("Misgan","Maya","Blen","BaBa");
		System.out.println("Second smaller string is: "+secondMin(strings));
		
		List<LocalDate> dates=Arrays.asList(LocalDate.of(2019, 11, 11),LocalDate.of(2020, 11, 11),LocalDate.now());
		System.out.println("Second latest date is: "+secondMin(dates));

	}

}
