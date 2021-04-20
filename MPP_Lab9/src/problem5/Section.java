package problem5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		
		return stream.skip(m).limit(n-m);
	}

public static void main(String[] args) {
 // Make three calls for the streamSection() method with different inputs 
 // use nextStream() method to supply the Stream input as a first argument in streamSection() method
 
			 Stream<String> stream1=streamSection(nextStream(),0,8); 
			 Stream<String> stream2=streamSection(nextStream(),1,8); 
			 Stream<String> stream3=streamSection(nextStream(),2,8); 
			 
			 System.out.println(stream1.collect(Collectors.toList()));
			 System.out.println(stream2.collect(Collectors.toList()));
			 System.out.println(stream3.collect(Collectors.toList()));
}

//support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}