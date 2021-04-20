package lab5prob2;

public final class Circle implements Area {
	private double radius;
	
	@Override
	public double computeArea() {
		double area = Math.PI * radius * radius; 
		return area;
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}
	private Circle()
	{
		
	}
	public double getradius()
	{
		return radius;
	}
	

}
