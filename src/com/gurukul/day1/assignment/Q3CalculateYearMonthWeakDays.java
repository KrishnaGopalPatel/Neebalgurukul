package com.gurukul.day1.assignment;

import java.util.Scanner;

public class Q3CalculateYearMonthWeakDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int year;
		int month;
		int week;
		int days;
		
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		year =n/365;
		n=n%365;		
		month=n/30;
		n=n%30;
		week=n/7;
		n=n%7;
		days=n;		
		System.out.println(year+"year:"+month+"month:"+ week+"week:"+days+"days");
	}
}
