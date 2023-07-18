package com.gurukul.day1;

import java.util.Scanner;

public class PrintSalary {

	public static void main(String[] args) {
		double salary;
		double Total;
		Scanner sc = new Scanner(System.in);
		salary=sc.nextDouble();
		if (salary<30000) {
		Total=(salary*5/100)+salary;
		System.out.println(Total);
			
		}
		else {
			System.out.println(salary);
		}
	}

}
