package generalTest;

import java.awt.Button;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {

	public static Stream<Character> characterStream(String s) {
		List<Character> result = new ArrayList<>();
		for (char c : s.toCharArray())
		result.add(c);
		return result.stream();
		}
	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("Misgan","Maya","Fantish","Renuka");
		
		final long count=words.stream().filter(w->w.length()>5).count();
		
		System.out.println(count);
		
		Stream<String> echoes = Stream.generate(() -> "Echo");
		echoes.limit(5).collect(Collectors.toList()).forEach(System.out::println);
		
		Stream<BigInteger> stream1=Stream.iterate(BigInteger.ONE, n->n.add(BigInteger.ONE));
		stream1.limit(5).collect(Collectors.toList()).forEach(System.out::println);
		
		Stream<Integer> stream2=Stream.iterate(1, n->n+1);
		stream2.limit(10).collect(Collectors.toList()).forEach(System.out::println);
		
		Stream<Double> randoms =Stream.generate(Math::random).limit(10);
		randoms.collect(Collectors.toList()).forEach(System.out::println);
		
		Stream<Character> combined =Stream.concat(characterStream("Hello"),characterStream("World"));

		combined.collect(Collectors.toList()).forEach(System.out::print);
		System.out.println("\n");
		
		Stream<Integer> stream3=Stream.iterate(1,n->n+1);
		stream3.skip(8).limit(7).filter(n->n%2==1).collect(Collectors.toList()).forEach(System.out::println);

		List<String> labels=Arrays.asList("Submit","Search","Print");
		Stream<Button> streamB=labels.stream().map(Button::new);
		List<Button> buttons=streamB.collect(Collectors.toList());


		char[] charArray = 
            {'s','p','e','a','k','i','n','g','c','s'};
	  //can create a string from a char array
	  System.out.println(new String(charArray));
	  
	  //do the same using constructor method reference
	  Function<char[], String> myFunc = String::new;
	  System.out.println(myFunc.apply(charArray));
	  
	  //List to array:
	  List<String> strList=Arrays.asList("Eleven","Strikes","The","Clock");
	  //solution1
	  String[] strArray=strList.stream().toArray(String[]::new);
	  System.out.println(Arrays.toString(strArray));
	  
	  //solution2
	  String[] stringArr1 = strList.toArray(new String[0]);
	  System.out.println(Arrays.toString(stringArr1));
	  
	  
	  //IntArrayExample
	//Set up inputs
			List<Integer> ints = Arrays.asList(3,5,2,3,8);
			
			//Create a list of int[]s by mapping ints, as input lengths, to int[] 
			//constructor
			List<int[]> intArrs = ints.stream()
					                  .map(int[]::new)
					                  .collect(Collectors.toList());
			
			//Represent each int[] in the list as a string so it can be printed,
			//mapping Arrays.toString to each int[] in the list
			List<String> intArrsStr = intArrs.stream()
					                         .map(Arrays::toString)
					                         .collect(Collectors.toList());
			System.out.println(intArrsStr);
		}
		
		public static void infStream() {
			List<int[]> intArrs = Stream.iterate(Integer.valueOf(1), n -> n+1).limit(4)
					.map(x -> x.intValue())
	                .map(int[]::new)
	                .collect(Collectors.toList());

			List<String> intArrsStr = intArrs.stream().map(Arrays::toString).collect(Collectors.toList());
			System.out.println(intArrsStr);	
		
		
			
			List<String> l = Arrays.asList("Bob", "Joe");
			//usual way
			System.out.println(l.stream()
					            .flatMap(x -> stringToCharStream(x))
					            .collect(Collectors.toList()));
			
			//this is the same as composing map with default flatMap
			System.out.println(l.stream()
					            .map(x -> stringToCharStream(x)) //produces a stream of streams
					            .flatMap((Stream<Character> st) -> st) //flattens to a single stream
					            .collect(Collectors.toList()));
			
		}
		
		static Stream<Character> stringToCharStream(String s) {
			char[] chars = s.toCharArray();
			Character[] chs = new Character[s.length()];
			for(int i = 0; i < s.length(); ++i) {
				chs[i] = chars[i];
			}
			return Stream.of(chs);
		}
		
		}
		
		
			  

		
	


