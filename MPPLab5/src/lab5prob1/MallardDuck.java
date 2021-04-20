package lab5prob1;

public class MallardDuck extends Duck{

	public MallardDuck() {
		
		setQuackBvr(new Quack());
		setFlyBvr(new FlyWithWings());
	}
@Override
public void display() {
	
		System.out.println("Displaying");
	}
}
