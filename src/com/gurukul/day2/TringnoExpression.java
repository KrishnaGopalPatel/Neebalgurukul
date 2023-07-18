package com.gurukul.day2;

import java.util.Scanner;

public class TringnoExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s=0;
		double f=1;
		double num=1;
		double x;
	Scanner sc= new Scanner(System.in);
	x=sc.nextDouble();
	x= Math.toRadians(x);
		for(int i=1; i<20; i++) {
			f=f*i;
			if(i%2==0) {
				s=s+num/f;
				num=-num*x*x;
			}
		}
		System.out.println(s);

	}

}
