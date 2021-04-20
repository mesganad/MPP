package lab5prob2;

public final class Triangle implements Area {
	private double base;
	private double height;
	
	@Override
	public double computeArea() {
		
		double area = 1/2 * base * height;
		return area;
	}
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	private Triangle()
	{
		
	}
	public double getBase()
	{
		return base;
	}
	public double getHeight()
	{
		return height;
	}
	
}
