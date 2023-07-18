package com.gurukul.day1.assignment;

import java.util.Scanner;

public class Q5LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=9;
		int n2=5;
		int n3=7;
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		if (n1>n2 && n1>n3) {			
			 System.out.println(n1 + "=n1 is largest number");
		}
		else if (n2>n3) {
			System.out.println(n2 + "=n2 is largest number");
		}
		else {
			System.out.println(n3+"=n3");
		}
	

	}

}
