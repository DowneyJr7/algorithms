package com.algs4.chapter1.section3;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 
 * @author donny
 * 背包是一种不支持从中删除元素的集合类型
 * Page No.76 1.3.1.4 背包
 */
public class Bag01 {

	public static void main(String[] args) {
		stats();
		/**
		 * 100 99 101 120 98 107 109 81 101 90
		 * 
		 * Mean: 100.60 Std dev: 10.51
		 */
	}

	public static void stats() {
		Bag<Double> numbers = new Bag<Double>();

		while (!StdIn.isEmpty()) {
			numbers.add(StdIn.readDouble());
		}

		int N = numbers.size();

		double sum = 0.0;
		for (Double x : numbers) {
			sum += x;
		}

		double mean = sum / N;

		sum = 0.0;
		for (Double x : numbers) {
			sum += (x - mean) * (x - mean);
		}
		double std = Math.sqrt(sum / (N - 1));
		StdOut.printf("Mean: %.2f\n", mean);
		StdOut.printf("Std dev: %.2f\n", std);
	}
}
