package com.gurukul.day2;

import java.util.Scanner;

public class Expresion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double sum=0;
		System.out.println("Enter the Number");
		Scanner sc  = new Scanner(System.in);
		n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			sum= sum+(1.0/(i*i));	
			
		}
		System.out.println(sum);

	}

}
