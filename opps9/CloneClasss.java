package com.yash.opps9;

public class CloneClasss {

	public static void main(String[] args) throws CloneNotSupportedException {

		ProductClass pro1 = new ProductClass(101, "Sugar", 2000, "Killo Gram");

		ProductClass pro2 = (ProductClass) pro1.clone();
		pro2.setPname("Wheat");
		pro2.setPrice(34353);

		System.out.println(pro2);
		if (pro2 instanceof ProductClass) {

			System.out.println("Objects Is Same");
		}
	}
}