package com.algs4.chapter1.section1.practice;

public class Increase {

	// 1.1.26
	public static void abcSort(int a, int b, int c) {
		int t = 0;
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		if (a > c) {
			t = a;
			a = c;
			c = t;
		}
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	static int i = 0;

	// 1.1.27
	public static double binomial(int N, int k, double p) {
		i++;
		if (N == 0 && k == 0)
			return 1.0;
		if (N < 0 || k < 0)
			return 1.0;
		return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
	}

	public static void main(String[] args) {
		System.out.println(binomial(2, 1, 0.25));
		System.out.println(i);
		
	}
}
