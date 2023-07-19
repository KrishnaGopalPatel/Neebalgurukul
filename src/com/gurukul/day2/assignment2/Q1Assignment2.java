package com.gurukul.day2.assignment2;

import java.util.Scanner;

public class Q1Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The r1 value ");
		int r1=sc.nextInt();
		
		System.out.println("Enter The th1 value ");
		int th1= sc.nextInt();
		
		System.out.println("Enter The r2 value ");
		int r2=sc.nextInt();
		
		System.out.println("Enter The th2 value ");
		int th2= sc.nextInt();
		
		//Convert into the Cartesian
		
		double dg1= Math.toRadians(th1);
		double dg2= Math.toDegrees(th2);
		
		double x1=r1*Math.cos(dg1);
		double y1=r1*Math.sin(dg1);
		
		double x2=r2*Math.cos(dg2);
		double y2= r2* Math.sin(dg2);
		
		double x3= x1+x2;
		double y3= y1+y2;
		
		//convert into the polar
		
		double r3=Math.sqrt(Math.pow(x3, 2)+Math.pow(y3, 2));
		
		double th3= Math.atan(y3/x3);
		
		double dg3 =Math.toDegrees(th3);
		
		System.out.println(r3);
		System.out.println(dg3);
		
		
		

	}

}
