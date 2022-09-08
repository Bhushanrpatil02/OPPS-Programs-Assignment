package com.yash.opps5;


public class D extends C 
{
	@Override
	void div(int a, int b) {
		System.out.println("Div from Class D");
		System.out.println(a/b);
		
	}
	public static void main(String[] args) {
		D d =new D();
		d.div(50, 2);
		d.mul(10, 5);
		d.sum(20, 20);
		d.sub(20, 10);
	}
}