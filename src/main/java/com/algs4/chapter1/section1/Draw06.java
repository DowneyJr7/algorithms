package com.algs4.chapter1.section1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author donny 
 * StdDraw绘图举例 
 * Page No.27 1.1.9.8 标准绘图库（控制方法）
 */
public class Draw06 {

	public static void main(String[] args) {
		sortRandomArray();
	}
	
	/**
	 * 函数值
	 */
	public static void functionValue() {
		int n = 100;
		StdDraw.setXscale(0, n);
		StdDraw.setYscale(0, n*n);
		StdDraw.setPenRadius(.01);
		for(int i=1; i<=n; i++) {
			StdDraw.point(i, i);
			StdDraw.point(i, i*i);
			StdDraw.point(i, i*Math.log(i));
		}
	}

	/**
	 * 随机数组
	 */
	public static void randomArray() {
		int n = 50;
		double[] a = new double[n];
		for(int i=0; i<n; i++) {
			a[i] = StdRandom.uniform();
		}
		for(int i=0; i<n; i++) {
			double x = 1.0 * i / n;
			double y = a[i] / 2.0;
			double rw = 0.5 / n;
			double rh = a[i] / 2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	}
	
	/**
	 * 已排序的随机数组
	 */
	public static void sortRandomArray() {
		int n = 50;
		double[] a = new double[n];
		for(int i=0; i<n; i++) {
			a[i] = StdRandom.uniform();
		}
		Arrays.sort(a);
		for(int i=0; i<n; i++) {
			double x = 1.0 * i / n;
			double y = a[i] / 2.0;
			double rw = 0.5 / n;
			double rh = a[i] / 2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	}
}
