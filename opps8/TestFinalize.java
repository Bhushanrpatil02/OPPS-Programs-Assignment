package com.yash.opps8;

public class TestFinalize {
	
	public static void main(String[] args)
	{
		TestFinalize t =new TestFinalize();
		
		System.gc();
		t=null;
		System.gc();
		System.out.println("-----------End------------");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Method");	
	}
}