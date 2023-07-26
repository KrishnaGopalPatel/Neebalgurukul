package com.gurukul.day3.assignment;

public class Q5Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int n = 1; n <= 10000; n++) {

			int x = n;
			int p = n;
			int p2 = n;
			int count = 0;
			int n1;
			int sum = 0;
			while (x != 0) {
				count++;
				x = x / 10;
			}

			while (p != 0) {
				n1 = p % 10;
				sum = (int) (sum + (Math.pow(n1, count)));
				p = p / 10;
			}
			if (sum == p2) {
				System.out.println(sum);
			}
		}

	}

}
