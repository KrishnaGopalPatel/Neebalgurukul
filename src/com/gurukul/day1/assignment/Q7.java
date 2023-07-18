package com.gurukul.day1.assignment;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h;
		int m;
		int time;
		Scanner sc= new Scanner(System.in);
		time=sc.nextInt();
		m=time%100;
		time=time/100;
		if (time>12) {
			time= time-12;
			System.out.println(time+":"+m+"pm");
		}
		else {
			System.out.println(time+":"+m+"am");
		}

	}

}
