package com.gurukul.day2.assignment2;

import java.util.Scanner;

public class Q5Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		int s=1;
		int fabonachi=0;		
		int count=0;		
		
		for(int i=1; i<=200; i++) {
			fabonachi=f+s;
			if (fabonachi%2==0) {
				System.out.println(fabonachi);
				count++;
			}
			if (count==10) {
				break;
			}
			f=s;
			s=fabonachi;			
		}	
		
	}

}
