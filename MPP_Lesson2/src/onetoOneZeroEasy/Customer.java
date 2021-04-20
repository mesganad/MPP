package onetoOneZeroEasy;

import onetoonezerofactory.ShopingCart;

//unidirectional
public class Customer {
private String name;
private ShoppingCart cart;

public Customer(String name) {
	 this.name=name;
	 
}
public void newCart(){
	if(null == cart) {
		this.cart=new ShoppingCart();
	}
	}


public String getName() {
	return name;
}


public ShoppingCart getCart() {
	return cart;
}



}
