package problem2ab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductInfo {
	static enum SortMethod {BYPRICE,BYTITLE};
	SortMethod method;
	
	public List<Product> sort(List<Product> prod,SortMethod method){

		
		if(method==SortMethod.BYPRICE) {
			Collections.sort(prod, new ProductPriceComparator());
		}
		else
		{
			Collections.sort(prod,new ProductTitleComparator());
		}
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
