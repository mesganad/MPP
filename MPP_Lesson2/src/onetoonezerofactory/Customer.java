package onetoonezerofactory;

//unidirectional
public class Customer {
 private String name;
 private ShopingCart cart;
 
 public Customer(String name) {
	 this.name=name;
	 //cart=new ShopingCart();
 }
public void setCart(ShopingCart cart){
	this.cart=cart;
	}
 

public String getName() {
	return name;
}


public ShopingCart getCart() {
	return cart;
}
 
 

}
