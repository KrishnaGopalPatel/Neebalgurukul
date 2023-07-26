package com.gurukul.day3.assignment;

public class Q3Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=4;j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		// right pattern
		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=4;j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
