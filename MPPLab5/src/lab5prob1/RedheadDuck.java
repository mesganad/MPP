package lab5prob1;

public class RedheadDuck extends Duck {

public RedheadDuck() {
		
		setQuackBvr(new Quack());
		setFlyBvr(new FlyWithWings());
	}
@Override
public void display() {
	
		System.out.println("Displaying");
	}
}
