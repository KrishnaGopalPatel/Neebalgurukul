package com.gurukul.day3;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		for (int i = 1; i <= 5; i++) {
			int y = 1;
			for (int j = 1; j <= i; j++) {
				int z = 1;
				System.out.print(x + "" + y + "" + z);
				x++;
				y++;
				z++;
			}
			System.out.println();
		}

	}

}
