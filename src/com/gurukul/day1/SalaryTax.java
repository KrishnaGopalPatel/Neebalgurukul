package com.gurukul.day1;

import java.util.Scanner;

public class SalaryTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary;
		double tax = 0;
		Scanner sc= new Scanner(System.in);
		salary= sc.nextDouble();
		tax= sc.nextDouble();
	if (salary>3000000) {
		tax=salary*30/100;
		salary= salary-tax;		
		
	} else if(salary>1000000){
		tax=salary*20/100;		
	} else if (salary>750000) {
		tax=salary*10/100;
	}
	
	System.out.println(tax);
		
	}

}
