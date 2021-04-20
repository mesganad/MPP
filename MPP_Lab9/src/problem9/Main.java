package problem9;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("vegeterian meal available? "+Dish.vegeterian());
		System.out.println("Healthy menu? "+Dish.healthyMenu());
		System.out.println("Unhealthy menu? "+Dish.unHealthyMenu());
		System.out.println("First Meat: "+ Dish.firstMeatType().get());
		System.out.println("Total calories using reduce: "+Dish.calculateTotalCalories().get());
        System.out.println("Total calories using method reference: "+Dish.calculateTotalCaloriesMethodReference().get());
	    
	}

}
