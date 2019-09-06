package com.tvm.assesment1.finalandstatic;

public class Finalclasstest {
	public static void main(String[] args) {
		try{
			Finalclass1 o=new Finalclass1();
			o.show();
			Finalclass o1=new Finalclass();
			o1.msg();
		}
		finally
		{
			System.out.println("this is finally..it always disply");
		}
		
		
	}

}
