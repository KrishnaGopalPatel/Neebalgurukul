package com.gurukul.day2;

import java.util.Scanner;

public class UperLimitLowerLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upper;
		int lower;
		Scanner sc= new Scanner(System.in);
		
		lower=sc.nextInt();
		upper= sc.nextInt();
		
		for(int i=lower; i<=upper; i++) {
			char ch= (char)i;
			System.out.println(ch+"-"+i);
		}
		

	}

}
