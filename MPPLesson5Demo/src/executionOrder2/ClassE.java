package executionOrder2;

public class ClassE {

	static int superInt=10;
	static {
		System.out.println("SuperInt="+superInt);
	}
	ClassE(){
		System.out.println("Running class E constructor");
	}
	{
		System.out.println("Runing super object initialization block");
	}
	
	
}
