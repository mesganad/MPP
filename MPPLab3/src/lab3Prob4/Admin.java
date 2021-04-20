package lab3Prob4;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static double computeTotalRent(List<Property> properties) {
		double totalRent = 0;

		for (Property p : properties) {
			totalRent += p.computeRent();
		

		}
		return totalRent;
	}
	
	  public static List<Property> listOfProperties(List<Property> properties) {
	  List<Property> listPro=new ArrayList<>(); 
	  for(Property p1: properties) {
	  if(p1.getAddress().getCity()=="Chicago") {
		  listPro.add(p1);
		  
	  }
	  }
	  return listPro;
	  }
	 
	 
}
