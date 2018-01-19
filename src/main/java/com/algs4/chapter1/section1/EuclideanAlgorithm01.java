package com.algs4.chapter1.section1;
/**
 * 
 * @author donny
 * 欧几里德算法又称辗转相除法，是指用于计算两个正整数a，b的最大公约数。
 * Page No.1 第1章 基础
 */
public class EuclideanAlgorithm01 {

	public static void main(String[] args) {
		System.out.println(gcd(1111111, 1234567));
	}

	/**
	 * 若q是0,则最大公约数为p;否则
	 * 将p除以q得到余数r，p和q的最大公约数是q和r的最大公约数
	 * @param a
	 * @param b
	 * @return
	 */
	private static int gcd(int p, int q) {
		if(q == 0)
			return p;
		int r = p % q;
		return gcd(q, r);
	}
}
