package com.gurukul.day3;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++)
				System.out.print(" ");

			for (int j = 1; j <= i; j++)
				System.out.print("*");
			if (i == 5) {
				for (int j = 1; j <= 4; j++) {
					System.out.print("*");
				}
			}

			System.out.println();

		}

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++)
				System.out.print(" ");

			for (int j = i; j <= 4; j++)
				System.out.print("*");

			System.out.println();
		}

	}

}
