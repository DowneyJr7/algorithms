package com.algs4.chapter1.section1;
/**
 * 
 * @author donny
 * 典型静态方法实现
 * Page No.13 1.1.6 静态方法
 */
public class StaticMethod03 {

	public static void main(String[] args) {
		System.out.println(sqrt(4.0));
	}
	
	/**
	 *获取整数绝对值
	 * @param a
	 * @return
	 */
	public static int absoluteInt(int a) {
		if(a > 0) {
			return a;
		}else {
			return -a;
		}
	}
	
	/**
	 *获取浮点绝对值
	 * @param a
	 * @return
	 */
	public static double absoluteDouble(double a) {
		if(a > 0.0) {
			return a;
		}else {
			return -a;
		}
	}
	
	/**
	 * 质数，素数
	 * @param i
	 * @return
	 * 定义为在大于1的自然数中，除了1和它本身以外不再有其他因数
	 */
	public static boolean isPrime(int n) {
		//小于2,直接false
		if(n < 2) return false;
		//i平方增长
		for(int i=2; i*i<=n; i++) {
			//有其它因数
			if(n % i == 0) 
				return false;
		}
		return true;
	}
	
	/**
	 * 牛顿迭代法
	 * @param c
	 * @return
	 * 计算平方根
	 */
	public static double sqrt(double c) {
		if(c < 0) return Double.NaN;
		double err = 1e-15;
		double t = c;
		while(Math.abs(t - c/t) > err * t) 
			t = (c/t + t) / 2.0;
		return t;
	}
	
	/**
	 * 牛顿迭代法
	 * @param c
	 * @return
	 * 计算三角形的斜边
	 */
	public static double hypotenuse(double a, double b) {
		return Math.sqrt(a*a + b*b);
	}
	
	/**
	 * 
	 * @param c
	 * @return
	 * 计算调和级数
	 */
	public static double H(double a, double N) {
		double sum = 0.0;
		for(int i = 1; i <= N; i++) {
			sum += 1.0 / i;
		}
		return sum;
	}
}
