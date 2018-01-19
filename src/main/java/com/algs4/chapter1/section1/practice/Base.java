package com.algs4.chapter1.section1.practice;

import edu.princeton.cs.algs4.StdOut;

public class Base {

	// 1.1.14
	public static int lg(int N) {
		// 利用将公式 m=log2N 转化为 N=2m 的原理
		// m = log 2 N
		int m = 0;
		for (; N > 1; N /= 2) {
			m++;
		}
		return m;
	}

	// 1.1.15
	public static int[] histogram(int[] a, int M) {
		int[] b = new int[M];
		int count = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					count++;
				}
			}
			b[i] = count;
			count = 0;
		}
		return b;
	}

	// 1.1.16 System.out.println(exR1(6));
	public static String exR1(int n) {
		if (n <= 0)
			return "";
		return exR1(n - 3) + n + exR1(n - 2) + n;
	}

	// 1.1.17
	public static String exR2(int n) {
		// 栈溢出
		String s = exR2(n - 3) + n + exR2(n - 2) + n;
		// 永远执行不到这句
		if (n <= 0)
			return "";
		return s;
	}

	// 1.1.18
	/**
	 * 2、递归算法 类似于分析法，抽丝剥茧回去 递归算法就是return 本次结果+用另外的参数调用自己。
	 */
	public static int mystery(int a, int b) {
		if (b == 0)
			return 0;
		if (b % 2 == 0)
			return mystery(a + a, b / 2);
		return mystery(a + a, b / 2) + a;
	}

	/**
	 * 乘方的递归形式
	 */
	public static int power(int a, int b) {
		if (b == 0)
			return 1;
		if (b % 2 == 0)
			return power(a * a, b / 2);
		return power(a * a, b / 2) * a;
	}

	/**
	 *
	 * 引入二进制例子 2|4……0 2|2……0 2|1……1 4的二进制表示为100
	 * 
	 * eg:3*4 011 * 100 1100
	 * 
	 * 将b看做二进制，当b的二进制位为1时，与a相乘。由1的位置决定a乘以几，依次为1，2，4，8，16，...,2^n。将各个乘积累加起来。
	 * （类似于十进制的乘法运算方式，不同位置的乘法依次会乘以1，10，100，1000，...，10^n，最后累加）
	 */
	/**
	 * 1、循环判断 类似综合法 大循环 判断b的二进制位是否为1{若是，sum+=a;若不是，不需要做任何操作，因为加0不影响} a=a*2
	 * 继续看更高一位，直到看完。
	 */
	public static int multi(int a, int b) {
		int isys = 2; // n进制
		int sum = 0;
		for (; b != 0; b /= isys) {
			if (b % isys != 0) {
				sum += a * (b % isys);
			}
			a *= isys;
		}
		return sum;
	}

	// 1.1.19
	public static long[] Fibonacci(long[] n) {
		n[0] = 0;
		n[1] = 1;
		for (int N = 2; N < n.length; N++) {
			n[N] = n[N - 1] + n[N - 2];
		}
		return n;
	}

	// 1.1.20
	public static double lnFactorial(int N) {
		if (N == 1)
			return 0;
		return Math.log(N) + lnFactorial(N - 1);
	}

	// 1.1.22
	public static int rank(int key, int[] a, int lo, int hi, int time) {
		// key是要寻找的值，lo和hi是查找范围，time记录递归深度，调用函数前应确保数组是有序的。
		for (int j = 1; j < time; j++)
			StdOut.print(" ");
		StdOut.print(time);
		StdOut.println();
		int mid = lo + (hi - lo) / 2;
		if (a[mid] == key)
			return mid;
		else if (a[mid] > key)
			return rank(key, a, lo, mid - 1, ++time);
		return rank(key, a, mid + 1, hi, ++time);
	}

	// 1.1.24
	public static int CommomDivisor(int x, int y) {
		if (x == 1 || y == 1) {
			StdOut.println("x=" + x + "\t y=" + y);
		}
		if (x < y) {
			int temp = x;
			x = y;
			y = temp;
		}
		StdOut.println("x=" + x + "\t y=" + y);
		if (x % y == 0) {
			return y;
		} else {
			x = x % y;
			StdOut.println("x=" + x);
			return CommomDivisor(x, y);
		}
	}
}
