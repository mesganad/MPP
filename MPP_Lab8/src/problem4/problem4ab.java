package problem4;

import java.util.Arrays;
import java.util.List;

public class problem4ab {

	public static void main(String[] args) {
    List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");

    //a. using lambda
   fruits.forEach(s->System.out.println(s));
   
   System.out.println("===================");
   
   //b. using method reference
   fruits.forEach(System.out::println);
	}

}
