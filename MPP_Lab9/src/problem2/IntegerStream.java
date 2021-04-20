package problem2;


import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class IntegerStream {

	public static final Function<int[],IntStream> myIntStream= numbers->IntStream.of(numbers);
	
	public static void main(String[] args) {
		
		int[] myIntNums=new int[] {1,2,3,4,5};
	    System.out.println("Minimum: "+myIntStream.apply(myIntNums).min().getAsInt());
	    System.out.println("Maximum: "+myIntStream.apply(myIntNums).max().getAsInt());
	    
	    
	    
	    
	    

	}

}
