package com.gurukul.day3;

public class WhileLoopProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7892;
		int sum=0;
		int k1;
		int k2;
		int k3;
		int k4;
		
		while (n!=0) {
			
			n=n/10;
			sum=sum+n%10;
			
		}
		System.out.println(sum);

	}

}
