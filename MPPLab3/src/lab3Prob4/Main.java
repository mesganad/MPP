package lab3Prob4;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		House house=new House(7000, "house");
		Condominium condo=new Condominium(3, "Condominium");
		Trailer trailer=new Trailer("Trailer");
		trailer.getAddress().setAddress("fairfield", "iowa", "333", "4th");
		house.getAddress().setAddress("florida", "Illinios", "333", "4th");
		condo.getAddress().setAddress("ohio", "Illinios", "333", "4th");
		List<Property> propertyList=new ArrayList<>();
		propertyList.add(trailer);
		propertyList.add(house);
		propertyList.add(condo);
		double totalRent = Admin.computeTotalRent(propertyList);
		System.out.println("Total rent of the properties is: "+totalRent);
		
		System.out.println("List of properties from chicago: "+Admin.listOfProperties(propertyList).toString());
		
	}
}
