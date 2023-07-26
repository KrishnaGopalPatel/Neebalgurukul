package com.gurukul.day3;

import java.util.Scanner;

public class GCDProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int re;
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y = sc.nextInt();
		while (x%y!=0) {
			re=x%y;
			x=y;
			y=re;
		}
		System.out.println(y); 

	}

}
