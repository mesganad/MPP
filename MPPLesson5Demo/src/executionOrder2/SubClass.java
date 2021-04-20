package executionOrder2;

public class SubClass {

	static int subInt=20;
	static {
		System.out.println("SubInt="+subInt);
	}
	SubClass(){
		System.out.println("SubClass constructor running");
	}
	{
		System.out.println("Running Sub object initialization block");
		
	}
}
