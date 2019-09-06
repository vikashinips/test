package variables;

import java.util.Scanner;

public class local {
	
	static int x;    // static variable
	
	public static void main(String arg[])
	{
		int a,b,c;    //Local variable
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		x=10;
		System.out.println(c);
		System.out.println(x);
		
	}
	}