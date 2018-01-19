package com.algs4.chapter1.section1;

/**
 * 
 * @author donny
 * 典型的数组处理
 * Page No.11 1.1.5 数组
 */
public class Array02 {
	
	public static void main(String[] args) {
//		double[] a = new double[5];
//		for(int i=0; i<a.length; i++) {
//			a[i] = i;
//		}
//		System.out.println(getMax(a));
//		System.out.println(getMean(a));
		
		//数据别名
		int[] a = new int[1];
		a[0] = 1234;
		int[] b = a;
		b[0] = 5678;
		System.out.println(a[0]);
	}
	
	/**
	 * 获取最大值
	 * @param a
	 * @return
	 */
	public static double getMax(double[] a) {
		double max = a[0];
		for (double d : a) {
			if(d > max) {
				max = d;
			}
		}
		return max;
	}
	
	/**
	 * 获取平均值
	 * @param a
	 * @return
	 */
	public static double getMean(double[] a) {
		double average = 0.0;
		for (double d : a) {
			average += d;
		}
		average /= a.length;
		return average;
	}
	
	/**
	 * 复制数组
	 * @param a
	 * @return
	 */
	public static double[] copyArray(double[] a) {
		int length = a.length;
		double[] b = new double[length];
		for(int i=0; i<length; i++) {
			b[i] = a[i];
		}
		return b;
	}
	
	/**
	 * 颠倒数组
	 * @param a
	 * @return
	 */
	public static double[] reverseArray(double[] a) {
		int length = a.length;
		double[] b = new double[length];
		for(int i=0; i<length/2; i++) {
			b[i] = a[length - i];
		}
		return b;
	}
	
	/**
	 * 矩阵相乘
	 * @param a
	 * @param b
	 * @return
	 */
	public static double[][] MatrixMultiplication (double[][] a, double[][] b) {
		int length = a.length;
		double[][] c = new double[length][length];
		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++) {
				for(int k=0; k<length; k++) {
					//计算行i和列j的点乘
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
}
