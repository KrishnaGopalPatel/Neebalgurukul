package com.gurukul.day1.assignment;

import java.util.Scanner;

public class Q1ConvertTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sec;
		int min;
		int hour;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		hour=n/3600000;
		n=n%3600000;
		min=n/60000;
		n=n%60000;
		sec=n/1000;		
		System.out.println(hour+" : "+min+" : "+sec);

	}

}
