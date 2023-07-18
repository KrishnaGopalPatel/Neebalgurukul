package com.gurukul.day2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exp;
		System.out.println("Enter values for choices:");
		Scanner sc= new Scanner(System.in);
		exp=sc.nextInt();
		
		switch (exp) {
		case 1:
		{	
			double a;
			double area;
			System.out.println("Enter values:");
			a= sc.nextDouble();
			area=a*a;
			System.out.println(area);
			break;
		}
		case 2:
		{	
			double r;
			double area;
			System.out.println("Enter values:");
			r= sc.nextDouble();
			area=3.14*r*r;
			System.out.println(area);
			break;
		}
		case 3:
		{	
			
			double a;
			double b;
			double area;
			System.out.println("Enter values:");
			a= sc.nextDouble();
			b= sc.nextDouble();
			area=0.5*a*b;
			System.out.println(area);
			break;
		}		

		default:
			break;
		}

	}

}
