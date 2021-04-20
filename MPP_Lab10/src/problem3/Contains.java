package problem3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Contains {

	public static <T extends Comparable<? super T>> boolean contains1(List<T>list, T s) {
		for(T x: list) {
			if(x==null && s==null) return true;
			if(x==null || s==null) return false;
			if(x.compareTo(s)==0) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		List<String> test=Arrays.asList("Bob", "Joie","Tom");
		boolean result =contains1(test,"Tom");
		System.out.println("Contains Tom? "+result);
		
		List<Integer> test2=Arrays.asList(1,2,3);
		boolean result2 =contains1(test2,3);
		System.out.println("Contains 3? "+result2);
		
		List<LocalDate> dates=Arrays.asList(LocalDate.of(2019, 11, 11),LocalDate.of(2020, 11, 11),LocalDate.now());
		boolean result3 =contains1(dates,LocalDate.of(2019, 11, 11));
		System.out.println("Contains 2019, 11, 11? "+result3);

	}

}
