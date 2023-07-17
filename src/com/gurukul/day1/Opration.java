package com.gurukul.day1;

import java.util.Scanner;

public class Opration {	

	public static void main(String[] args) {
		// sum of digit
		int a;
		int sum;
		int d1;
		int d2;
		int d3;
		
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		d1=a%10;
		d2=a/10%10;
		d3=a/100;
		sum=d1+d2+d3;
		System.out.println(sum);
		 // reverse the digit
		int rev;
		rev= d1*100+d2*10+d3*1;	
		System.out.println(rev);
		
		// sum of reverse digit
		int sum1;
		int dr1;
		int dr2;
		int dr3;
		rev=sc.nextInt();
		dr1=rev%10;
		dr2=rev/10%10;
		dr3=rev/100;
		sum1 = dr1+dr2+dr3;
		System.out.println(sum1);

	}

}
