package com.gurukul.day2.assignment2;

import java.util.Scanner;

public class Q2Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double x=sc.nextDouble();
		x=Math.toRadians(x);
		double s=0;		
		double f=1;
		double num=x;
		
		for(int i=1; i<=20; i++) {
			f=f*i;
			if (i%2==0) { 
				s=s+num/f;
				num= -num*x*x;
			}			
		}
		System.out.println(s);
		System.out.println(Math.cos(x));
	}

}
