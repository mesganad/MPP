package genericMethod;

public class GenericMethod {
	static <E> void print(E[] a) {
		for(E ae:a) {
			System.out.printf("%s",ae);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		args= new String[] {"CA","US","MX","HN","GT"};
		print(args);
		Integer[] ints=new Integer[] {1,2,3};
		print(ints);
	}
}
