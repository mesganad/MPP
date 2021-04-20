package problem2c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import problem2ab.ProductTitleComparator;

public class ProductInfo {
	static enum SortMethod {BYPRICE,BYTITLE};
	SortMethod method;
	
	public List<Product> sort(List<Product> prod, SortMethod method){

		class ProductComparator implements Comparator<Product>{

			@Override
			public int compare(Product p1, Product p2) {
				if(method==SortMethod.BYTITLE)
				return p1.title.compareTo(p2.title);
				else {
				      if(p1.price==p2.price) return 0;
				      else if(p1.price<p2.price) return -1;
				      else return 1;
				}
				}
			
			}
			Collections.sort(prod, new ProductComparator());
			return prod;
		
	}
	
	public static void main(String[] args) {
		
	
		List<Product> prodList=new ArrayList<>();
		prodList.add(new Product("Ford",10000.0,2021));
		prodList.add(new Product("Yaris",15000.0,2019));
		prodList.add(new Product("Huandai",20000.0,2018));
		
		ProductInfo prodInfo=new ProductInfo();
		System.out.println(prodInfo.sort(prodList, SortMethod.BYPRICE));
		System.out.println(prodInfo.sort(prodList, SortMethod.BYTITLE));
		
	}

}
