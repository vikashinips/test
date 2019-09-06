package com.asminds.assesment1.conditions;

import java.util.Scanner;

public class Ifcondition {
	public static void main(String arg[])
	{
		int age;
		System.out.println("Enter ur age");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age>=18)
			System.out.println("ur elagible for vote");
		else
			System.out.println("ur not for eliagible vote");
	}
}
