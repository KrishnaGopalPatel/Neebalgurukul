package com.gurukul.day2;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		int div;
		Scanner sc= new Scanner(System.in);
		year= sc.nextInt();
		
		if (year%400==0 || year%4==0 && year%100==0) {
			System.out.println("this year is leap year");
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
