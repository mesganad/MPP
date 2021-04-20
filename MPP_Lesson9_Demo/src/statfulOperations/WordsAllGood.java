package statfulOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsAllGood {
	
	public static void main(String[] args) {
		
		//using lambda
		List<String> words=Arrays.asList("maya","Misgan","Asmamaw");
		Stream<String> longestFirst=words.stream().sorted((x,y)->y.length()-x.length());
		System.out.println(longestFirst.collect(Collectors.toList()));
		
		//using methodReference
		Stream<String> longestFirst2=words.stream().sorted(Comparator.comparing(String::length).reversed());
		System.out.println(longestFirst2.collect(Collectors.toList()));
	}

}
