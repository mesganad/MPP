package lab3Prob3;

public class CylinderCompose {

	private double height;
	private double radius;
	CylinderCompose(double radius){
		 this.radius=radius;
		 
	}
	public double computeVolume(double height){
		this.height=height;
		return Math.PI*radius*radius*height;
	}
	public double getHeight() {
		return height;
	}
	
}
