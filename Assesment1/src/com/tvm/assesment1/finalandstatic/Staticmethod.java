package com.tvm.assesment1.finalandstatic;

public class Staticmethod {
	static String name="manju";
	static void msg()
	{
		name="vikash";
		System.out.println("this is static method ");
		System.out.println("my static variable is name, i initilaize the value is manju bt i change inside the static method change the value for static variable to "+name );
	}

}
