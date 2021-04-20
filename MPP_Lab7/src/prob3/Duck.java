package prob3;

abstract public class Duck implements Flyable, Quackable {	
	abstract public void display();
	
	public void swim() {
		System.out.println("  swimming");
	}
	
}
