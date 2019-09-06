package com.asminds.assessment1.loops;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		int n,i=1,a;
		
		System.out.println("Enter any number for tables");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<=10)
		{
			a=i*n;
			System.out.println(i+" * "+n+" = "+a);
			i++;
		}

	}

}
