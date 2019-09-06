package com.asminds.assesment1.conditions;

import java.util.Scanner;

public class Elseiflader {

	public static void main(String[] args) {
		char s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 1 character");
		s = sc.next().charAt(0);
		if (s == 'a')
			System.out.println("This is vowel");
		else if (s == 'e')
			System.out.println("This is vowel");
		else if (s == 'i')
			System.out.println("This is vowel");
		else if (s == 'o')
			System.out.println("This is vowel");
		else if (s == 'u')
			System.out.println("This is vowel");
		else
			System.out.println("This is not a vowel");

	}

}
