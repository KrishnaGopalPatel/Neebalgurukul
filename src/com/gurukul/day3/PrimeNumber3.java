package com.gurukul.day3;

import java.util.Scanner;

public class PrimeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		boolean isprime=true;
		for(int i=2; i<=Math.sqrt(num); i++) {
			if (num%i==0) {
				isprime=false;
				break;				
			}
		}
		if (isprime) {
			System.out.println("prime Number");
		}
		else {
			System.out.println("Not a Prime number");
		}

	}

}
