package lab3Prob2;

import java.util.List;

public class Building {
	private List<Apartment> apartments;
	private double maintenanceCost;

	public Building(double maintenanceCost, List<Apartment> apartments) {
		this.maintenanceCost = maintenanceCost;
		this.apartments = apartments;
	}

	public double calcProfit() {
		double baseProfit = 0.0;
		for (Apartment a : apartments) {
			baseProfit += a.getRent();
		}
		return baseProfit - maintenanceCost;
	}
}