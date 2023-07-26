package com.gurukul.day3;

public class WhileLoopProb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;		
		int x=153;
		int p=153;
		int count=0;
		int n1;
		double sum=0;
		while(n!=0)
		{
			count++; 
			n=n/10;			
		}
		System.out.println("Number of digit is="+count);
		while(x!=0) {
			n1=x%10;
			x=x/10;
			sum =sum+(Math.pow(n1, count));
		}
		if (sum==p) {
			System.out.println("This is armstrong number");
		}
		else {
			System.out.println("this is not a armstrong number");
		}

	}

}
