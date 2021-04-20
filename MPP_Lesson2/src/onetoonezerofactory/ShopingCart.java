package onetoonezerofactory;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart {
	private List<Item> items;
	
	private ShopingCart(Customer c){
		
		items=new ArrayList<Item>();
		c.setCart(this);
	}
	
	//factory method
	public static ShopingCart creatShopingCart(Customer cust) {
		if(null == cust) {
			throw new NullPointerException("Null Customer");
		}
		return new ShopingCart(cust);
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public List<Item> getItems(){
		return this.items;
	}

}
