package lab3Prob3;

public class Main {

	public static void main(String[] args){
		Cylinder c = new Cylinder(2.0,2.0);
		double volume = c.computeVolume();
		System.out.println("Volume of cylinder is: "+volume);
		//LSP is not obeyed
		Circle ci=new Circle(2.0);
		System.out.println("Area of circle is: "+ci.computeArea());
		
	}
}
