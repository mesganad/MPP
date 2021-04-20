package lab3Prob3;

public class CircleCompose {

	private double radius;
	private CylinderCompose cylinder;
	
	public CircleCompose(double radius) {
		this.radius=radius;
		cylinder=new CylinderCompose(radius);
	}
	
	public double getRadius() {
		return radius;
	}
	public CylinderCompose getCylinder() {
		return cylinder;
	}
	public double computerArea() {
		return Math.PI*radius*radius;
	}
}
