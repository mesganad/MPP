package lab5prob1;

public abstract class Duck {
	private QuackBehavior quackBvr;
	private FlyBehavior flyBvr;
	
	
	public  void swim() {
		System.out.println("Swimming");
	}
	
	public void setFlyBvr(FlyBehavior flyBvr) {
		this.flyBvr=flyBvr;
	}
	public void setQuackBvr(QuackBehavior quackBvr) {
		this.quackBvr=quackBvr;
	}
	
public void fly() {
		flyBvr.fly();
	}
public void quack() {
	quackBvr.quack();
}
	public abstract void display();

	
}
