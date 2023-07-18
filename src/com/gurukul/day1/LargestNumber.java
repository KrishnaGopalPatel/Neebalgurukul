package com.gurukul.day1;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if (a>b) {
			System.out.println(a);
		}
		else if (a>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		

	}

}
