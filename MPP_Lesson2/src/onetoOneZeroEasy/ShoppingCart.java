package onetoOneZeroEasy;

import java.util.ArrayList;
import java.util.List;

import onetoonezerofactory.Item;

public class ShoppingCart {
	List<Item>items;
	
	ShoppingCart(){
		items=new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	public List<Item> getItems(){
		return items;
	}

	

}
