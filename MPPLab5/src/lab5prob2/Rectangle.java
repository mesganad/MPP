package lab5prob2;

public final class Rectangle implements Area {
	private double width;
	private double length;
	
	@Override
	public double computeArea() {
		
		double area =  width * length;
		return area;
	}
	public Rectangle(double width, double length)
	{
		this.width = width;
		this.length = length;
	}
	private Rectangle()
	{
		
	}
	public double getWidth()
	{
		return width;
	}
	public double getLength()
	{
		return length;
	}
}