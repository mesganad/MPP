package problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountWords {

	 static int countWords(List<String> words, String c, String d, int len) {
		return (int) words.stream()
				.filter(w->!w.contains(d))
				.filter(w->w.contains(c))
				.filter(w->w.length()==len).count();
				
	}

	public static void main(String[] args) {
		List<String> strList= new ArrayList<>();
		strList=Arrays.asList("Misgan","Mayac","Blen","Cousine","Daughter");
		System.out.println("Number of words that contains c but not d and with length equal to len: "
				+ ""+countWords(strList,"c","d",5));
		
	}

}
