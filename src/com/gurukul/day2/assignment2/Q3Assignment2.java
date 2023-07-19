package com.gurukul.day2.assignment2;

import java.util.Scanner;

public class Q3Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double sum=1;
		double f=1;
		 System.out.println("Enter The Input");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		 double x=sc.nextDouble();		
		 for(int i=1; i<=n; i++) {
			 f=f*i;
			 sum= (sum+Math.pow(x, i)/f);
		 }
		 System.out.println(sum);
	}

}
