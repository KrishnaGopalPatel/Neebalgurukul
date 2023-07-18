package com.gurukul.day2.assignment2;

import java.util.Scanner;

public class Q6Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		int s=1;
		int fib=0;	
		
		Scanner sc=new Scanner(System.in);	
		int lower=sc.nextInt();
		int upper=sc.nextInt();
		
		for(int i=1; i<=200; i++) {
			fib=f+s;
			if (fib>=lower && fib<=upper) {
				System.out.println(fib);				
			}
			if (fib>upper) {
				break;
			}
			f=s;
			s=fib;			
		}	

	}

}
