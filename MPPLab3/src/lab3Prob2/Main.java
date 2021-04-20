package lab3Prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	
		/*
		 * Apartment apt1=new Apartment(100); Apartment apt2=new Apartment(200);
		 * List<Apartment> apartList1=new ArrayList<>(); apartList1.add(apt1);
		 * apartList1.add(apt2); Building build1=new Building(100,apartList1);
		 * 
		 * Apartment apt3=new Apartment(200); Apartment apt4=new Apartment(100);
		 * List<Apartment> apartList2=new ArrayList<>(); apartList2.add(apt3);
		 * apartList2.add(apt4); Building build2=new Building(150,apartList1);
		 * List<Building> buildingList=new ArrayList<>(); buildingList.add(build1);
		 * buildingList.add(build2);
		 * 
		 * LandLord landLord=new LandLord(buildingList);
		 * System.out.println("Net profit is: "+landLord.calcProfits());
		 * 
		 */	
	Apartment[] apts1= {new Apartment(100), new Apartment(200)};
	Apartment[] apts2= {new Apartment(200), new Apartment(100)};
	Building[] bldgs= {new Building(50, Arrays.asList(apts1)), new Building(100, Arrays.asList(apts2))};
	LandLord landLord=new LandLord(Arrays.asList(bldgs));
	System.out.println("Total profit: "+landLord.calcProfits());
	}
	

}
