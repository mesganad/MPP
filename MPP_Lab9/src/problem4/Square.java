package problem4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Square {

	public static void printSquares(int num) {
		int[] squares=IntStream.iterate(1, n->n+1).map(n->n*n).limit(num).toArray();
		System.out.println("Squares: "+Arrays.toString(squares));
	}
	public static void main(String[] args) {
		
		printSquares(4);
		
	}

}
