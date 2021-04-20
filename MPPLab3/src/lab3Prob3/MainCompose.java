package lab3Prob3;

public class MainCompose {
	
	public static void main(String[] args) {
		CircleCompose circle = new CircleCompose(2.0);
		System.out.println("Area of the circle is: "+circle.computerArea());
		System.out.println("Volume of cylinder is: "+circle.getCylinder().computeVolume(2.0));
		}

}
