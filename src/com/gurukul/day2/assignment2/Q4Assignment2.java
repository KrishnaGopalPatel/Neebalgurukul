package com.gurukul.day2.assignment2;

import java.util.Scanner;

public class Q4Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int qd = 1;
		if(x==0 && y==0) {
			System.out.println("This is origin point");
		}
		if(x>0 && y>0) {
			qd=1;
			System.out.println("First Quadrant");
		}
		if(x<0 && y>0) {
			qd=2;
			System.out.println("Second Quadrant");
		}
		if(x<0 && y<0) {
			qd=3;
			System.out.println("Third Quadrant");
		}
		if(x>0 && y<0) {
			qd=4;
			System.out.println("fourth Quadrant");
		}
		if(x==0) {
			System.out.println(" this is x axis");
		}
		if(y==0) {
			System.out.println(" this is y axis");
		}
		System.out.println(qd);
	}

}
