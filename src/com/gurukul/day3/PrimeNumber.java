package com.gurukul.day3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		boolean isprime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isprime = false;

				break;
			}
		}
		if (isprime) { 
			System.out.println("Number is prime");
		} else {
			System.out.println("number is not prime");

		}
	}

}
