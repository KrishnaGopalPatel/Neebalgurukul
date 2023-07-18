package com.gurukul.day2;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;	
		int pow;
		Scanner sc= new Scanner(System.in);
		b=sc.nextInt();	
		pow = sc.nextInt();
		int multiply=1;
		
		for(int i=1; i<=pow; i++) {
			 multiply= multiply*b;	
			 
		}
		System.out.println(multiply);

	}

} 
