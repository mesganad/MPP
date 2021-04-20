package onetoOneZeroEasy;

public class Item {

	private String itemName;
	private String model;
	public Item(String itemName, String model) {
		this.itemName=itemName;
		this.model=model;
		
	}
	public String getItemName() {
		return itemName;
	}
	public String getModel() {
		return model;
	}
	
	@Override
	public String toString() {
		return itemName + "->"+model;
	}
	
	
}
