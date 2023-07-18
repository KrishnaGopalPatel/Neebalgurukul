package com.gurukul.day1.assignment;

import java.util.Scanner;

public class Q6ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int n1;
		int n2;
		int n3;
		int a;
		int b;
		int c;
		int arm;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		n1=n%10;
		n2=(n/10)%10;
		n3=n/100;		
		 a=n1*n1*n1;
		 b=n2*n2*n2;
		 c=n3*n3*n3;
		 arm=a+b+c;
		 if (arm==n) {

				System.out.println("armstrong number " +n);
		}
		 else {
			System.out.println("not armstrong number "+n);
		}
		
		
	}

}
