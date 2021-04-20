package problem6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union {

	public static final Set<String> EMPTY_SET = new HashSet<String>();
	public static  Set<String> union(List<Set<String>> sets){
		
		return sets.stream().reduce(EMPTY_SET, (x,y)-> {x.addAll(y);return x;});
		
	}
	public static void main(String[] args) {
	
		List<Set<String>> listOfSets=new ArrayList<Set<String>>() {
			{
				add(new HashSet<String>(Arrays.asList("A","B")));
				add(new HashSet<String>(Arrays.asList("D")));
				add(new HashSet<String>(Arrays.asList("1","3","5")));
			}
		};
		
		System.out.println("Union: "+union(listOfSets));
		
		

	}

	
}
