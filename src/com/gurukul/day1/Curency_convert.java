package com.gurukul.day1;

import java.util.Scanner;

public class Curency_convert {

	public static void main(String[] args) {
		int amt;	
		
		Scanner sc = new Scanner(System.in);
		amt=sc.nextInt();	
			
		int twothousand= amt/2000;
		amt=amt%2000;
		int fivehu=amt/500;
		amt=amt%500;
		int twohu= amt/200;
		amt=amt%200;
		int hu=amt/100;
		amt=amt%100;
		int fifty= amt/50;
		amt=amt%50;
		int twenty=amt/20;
		amt=amt%20;
		int ten= amt/10;
		amt=amt%10;
		int five= amt/5;
		amt=amt%5;
		System.out.println(twothousand+ "*2000="+(twothousand*2000));
		System.out.println(fivehu+ "*500="+(fivehu*500));
		System.out.println(twohu+ "*200="+(twohu*200));
		System.out.println(hu+ "*100="+(hu*100));
		System.out.println(fifty+ "*50="+(fifty*50));
		System.out.println(twenty+ "*20="+(twenty*20));
		System.out.println(ten+ "*10="+(ten*10));
		System.out.println(five+ "*5="+(five*5));			
		

	}

}
