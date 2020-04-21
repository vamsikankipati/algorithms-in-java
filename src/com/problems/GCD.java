package com.problems;

public class GCD {
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		int c = a % b;
		return gcd(b, c);
	}

	public static void main(String[] args) {
		System.out.println(gcd(3, 0));
	}
}
