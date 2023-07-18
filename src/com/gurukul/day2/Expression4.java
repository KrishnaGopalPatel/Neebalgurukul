package com.gurukul.day2;

public class Expression4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s=0;
		double f=1;
		double num=1;
		for(int i=1; i<20; i++) {
			f=f*i;
			if (i%2!=0) {
				s=s+num/f;
				num=-num;
			}
		}
		System.out.println(s);

	}

}
