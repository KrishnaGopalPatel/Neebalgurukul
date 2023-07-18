package com.gurukul.day2;

import java.util.Scanner;

public class SumFirstNNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		int sum=0;
		for(int i=0; i<=n; i++) {
			 sum=sum+i;
			System.out.println(sum);
			
		}

	}

}
