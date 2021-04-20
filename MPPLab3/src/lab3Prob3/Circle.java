package lab3Prob3;

public class Circle extends Cylinder{

	private double radius;
	public Circle(double radius){
		super(radius);
	}	
	
	public double computeArea(){
		double rad=super.getRadius();
		return Math.PI*rad*rad;
	}
	public double getRadius() {
		return radius;
	}
	
	
}
