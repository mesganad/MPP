package problem2d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductInfo {
	static enum SortMethod {
		BYPRICE, BYTITLE
	};

	SortMethod method;

	public List<Product> sort(List<Product> prod, SortMethod method) {

		Collections.sort(prod, (p1, p2) -> {
			if (method == SortMethod.BYTITLE) {
				if (p1.title.compareTo(p2.title)==0) {
					if (p1.model == p2.model)
						return 0;
					else if (p1.model < p2.model)
						return -1;
					else
						return 1;
				}

				else {
					return p1.title.compareTo(p2.title);
				}
			}
			throw new IllegalArgumentException("Cannot compare");

		});
		return prod;
	}

	public static void main(String[] args) {

		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product("Ford", 10000.0, 2021));
		prodList.add(new Product("Ford", 15000.0, 2019));
		prodList.add(new Product("Ford", 20000.0, 2018));

		ProductInfo prodInfo = new ProductInfo();
		System.out.println(prodInfo.sort(prodList, ProductInfo.SortMethod.BYTITLE));

	}

}
