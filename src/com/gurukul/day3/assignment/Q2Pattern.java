package com.gurukul.day3.assignment;

public class Q2Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=9; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print("*");
				if (j==5) {
					break;
				}
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			
		}
		for(int i=1; i<=5; i++) {
			for(int j=4;j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}	

	}

}
