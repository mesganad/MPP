package lab5prob1;

public class RubberDuck extends Duck {

public RubberDuck() {
		
		setQuackBvr(new Squeak());
		setFlyBvr(new CannotFly());
	}
@Override
public void display() {
	
		System.out.println("Displaying");
	}
}
