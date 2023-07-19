package com.gurukul.day1.assignment;

import java.util.Scanner;

public class Q2Interchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int n1;
		int n2;
		int a;
		
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		n1= n/100; 
		n2=n%100;
		a=n2*100+n1;
		System.out.println(a);
		
		
	}
}
 