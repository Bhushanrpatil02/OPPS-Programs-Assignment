package com.yash.opps5;

public class A extends CalcAbs
{

	@Override
	void sum(int a, int b) {
	System.out.println("Override Method Sum From CalcAbs");
	System.out.println(a+b);
	}

	@Override
	void sub(int a, int b) {
		System.out.println("Override Method Sub From ClacAbs");
	}

	@Override
	void mul(int a, int b) {
		System.out.println("Override Method Mul From ClacAbs");
	}

	@Override
	void div(int a, int b) {
		System.out.println("Override Method Div From ClacAbs");
	}
}