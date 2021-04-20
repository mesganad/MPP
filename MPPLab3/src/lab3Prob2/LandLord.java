package lab3Prob2;

import java.util.List;

public class LandLord {
		private List<Building> buildings;
		public LandLord(List<Building> build) {
			buildings = build;
		}
		public double calcProfits() {
			double profit = 0.0;
			for(Building b : buildings) {
				profit += b.calcProfit();
			}
			return profit;
		}
	}


