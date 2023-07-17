package com.gurukul.day1;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		double km;
		double m;
		double cm;
		double fit;
		double inch;
		Scanner sc= new Scanner(System.in);
		km =sc.nextDouble();
		m= km*1000;
		cm= m*100;
		inch= cm/2.54;
		fit= inch/12;
		System.out.println(km);
	}
}
