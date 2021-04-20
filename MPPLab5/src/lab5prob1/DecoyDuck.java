package lab5prob1;

public class DecoyDuck extends Duck {
	
public DecoyDuck() {
		
		setQuackBvr(new MuteQuack());
		setFlyBvr(new CannotFly());
	}
@Override
public void display() {
	
		System.out.println("Displaying");
	}
	
}
