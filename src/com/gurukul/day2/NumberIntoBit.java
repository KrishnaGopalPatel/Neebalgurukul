package com.gurukul.day2;

import java.util.Scanner;

public class NumberIntoBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int n; int remainder; Scanner sc= new Scanner(System.in); n= sc.nextInt();
		 * remainder =n%2; n=n/2; remainder=n%2;
		 */
		int x = 75;
		int n = 2;
		System.out.println((x>>(n-1)&1));

	}

}
