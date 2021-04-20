package lab3Prob3;

public class Cylinder {

	private double height;
	private double radius;

	public Cylinder(double radius) {
		this.radius= radius;
	}
	public Cylinder(double radius, double _height){
		this.radius=radius;
		this.height = _height;
	}
	
	public double getHeight(){
		return this.height;
	}
	public double getRadius() {
		return radius;
	}
	
	public double computeVolume(){
		return Math.PI*this.radius*this.radius* this.height;
	}
}
