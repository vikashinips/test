package variables;

import java.util.Scanner;

public class instance {
	int a,b;
	public static void main(String arg[])
	{
		instance o=new instance();
		Scanner sc=new Scanner(System.in);
		o.a=sc.nextInt();
		o.b=sc.nextInt();
		System.out.println("Multiplication of a&b="+o.a*o.b);
	}
}
