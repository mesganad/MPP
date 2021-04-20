package extpackage;

import java.util.List;

import onetoonezerofactory.Customer;
import onetoonezerofactory.Item;
import onetoonezerofactory.ShopingCart;

public class MainCustomer {

	public static void main(String[] args) {
		Customer c=new Customer("Misgan");
		ShopingCart sc=ShopingCart.creatShopingCart(c);
		Item it=new Item("laptop","toshiba");
		c.getCart().addItem(it);
		System.out.println(c.getCart().getItems());
		
	}
	
}
