package executionOrder;

public class MySuper extends MySuperSuper {
	public void myMethod() {
		System.out.println("Hello");
		super.myMethod();
	}

}
