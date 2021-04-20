package lab5prob2;

import java.util.ArrayList;

public class Main {
	static private ArrayList<Area> list;
	
	public static void main(String[] args) {
		
		list = new ArrayList<Area>();
		list.add(new Rectangle(5,7));
		list.add(new Circle(5));
		list.add(new Triangle(5, 7));
		double sum = 0.0;
		for(int i=0;i<list.size();i++)
		{
			sum += list.get(i).computeArea();
		}
		System.out.println("Sum of areas:"+sum);
	}

}
