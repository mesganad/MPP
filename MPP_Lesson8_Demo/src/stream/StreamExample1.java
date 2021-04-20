package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;

public class StreamExample1 {
	
	public List<String> findStartsWithLetter(List<String> strList, String letter){


		return strList.stream()
				.filter(name->name.startsWith(letter))
				.map(name->name.toUpperCase())
				.collect(Collectors.toList());
}
}
