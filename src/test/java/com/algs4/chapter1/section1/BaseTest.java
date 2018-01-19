package com.algs4.chapter1.section1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.algs4.chapter1.section1.practice.Base;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BaseTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void one() {
		// 1.1.1
		System.out.println((0 + 15) / 2);// 7
		System.out.println(2.0e-6 * 100000000.1);// 200.0000002
		System.out.println(true && false || true && true);// true
	}

	@Test
	public void two() {
		// 1.1.2
		Object obj = new Object();
		obj = (1 + 2.236) / 2;
		System.out.println(obj);// 1.618
		System.out.println(obj instanceof Double);// true
		obj = 1 + 2 + 3 + 4.0;
		System.out.println(obj);// 10.0
		System.out.println(obj instanceof Double);// true
		obj = 4.1 >= 4;
		System.out.println(obj);// true
		System.out.println(obj instanceof Boolean);// true
		obj = 1 + 2 + "3";
		System.out.println(obj);// "33"
		System.out.println(obj instanceof String);// true
	}

	@Test
	public void three() {
		// 1.1.3
		int i = StdIn.readInt();
		int j = StdIn.readInt();
		int k = StdIn.readInt();
		if (i == j && i == k && j == k) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

	}

	@Test
	public void six() {
		// 1.1.6
		int f = 0, g = 1;
		for (int i = 0; i <= 15; i++) {
			System.out.println(f);
			f = f + g;
			g = f - g;
		}
	}

	@Test
	public void seven() {
		// 1.1.7
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > 0.001)
			t = (9.0 / t + t) / 2.0;
		StdOut.printf("%.5f\n", t);// 3.00009
		System.out.println(t);// 3.00009155413138

		int sum1 = 0;
		for (int i = 1; i < 1000; i++)
			for (int j = 0; j < i; j++)// 1+2+...+998+999=999(1+999)/2
				sum1++;
		StdOut.println(sum1);// 499500
		System.out.println(sum1);// 499500

		int sum2 = 0;
		for (int i = 1; i < 1000; i *= 2)
			for (int j = 0; j < 1000; j++)
				sum2++;
		StdOut.println(sum2);// 10000
		System.out.println(sum2);// 10000
	}

	@Test
	public void eight() {
		// 1.1.8
		System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char) ('a' + 4));
	}

	@Test
	public void nine() {
		// 1.1.9
		int n = 3;
		String str = Integer.toBinaryString(n);
		System.out.println(str);

		String s = "";
		for (int i = n; i > 0; i /= 2)
			s = (i % 2) + s;
		System.out.println(s);
	}

	@Test
	public void eleven() {
		// 1.1.11
		String[][] strs = new String[3][3];
		strs[0][0] = "*";
		strs[0][1] = " ";
		strs[0][2] = "*";
		strs[1][0] = " ";
		strs[1][1] = " ";
		strs[1][2] = "*";
		strs[2][0] = "*";
		strs[2][1] = " ";
		strs[2][2] = "*";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				String str = strs[i][j];
				if ("*".equals(str)) {
					System.out.print(true + "\t");
				}
				if (" ".equals(str)) {
					System.out.print(false + "\t");
				}
			}
			System.out.println();
		}
	}

	@Test
	public void twelve() {
		// 1.1.12
		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = 9 - i;// 9876543210
		for (int i = 0; i < 10; i++)
			a[i] = a[a[i]];// 0123443210
		for (int i = 0; i < 10; i++)
			System.out.println(a[i]);
	}

	@Test
	public void thirteen() {
		// 1.1.13
		int m = 3;
		int n = 2;
		String[][] strs = new String[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				strs[i][j] = String.valueOf(i + 1) + String.valueOf(j + 1);
				System.out.print(strs[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		String[][] trss = new String[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				trss[i][j] = strs[j][i];
				System.out.print(trss[i][j] + "\t");
			}
			System.out.println();
		}
	}

	@Test
	public void fourteen() {
		// 1.1.14
		System.out.println(Base.lg(4));
	}

	@Test
	public void fifteen() {
		// 1.1.15
		int[] a = { 0, 1, 2, 2, 3, 3, 3 };
		int[] b = Base.histogram(a, 4);
		for (int i : b) {
			System.out.println(i);
		}
	}

	@Test
	public void sixteen() {
		// 1.1.16
		System.out.println(Base.exR1(6));
	}

	@Test
	public void seventeen() {
		// 1.1.17
		System.out.println(Base.exR2(6));
	}

	@Test
	public void eighteen() {
		// 1.1.18
		System.out.println(Base.multi(2, 25));
		System.out.println(Base.multi(3, 11));
		System.out.println(Base.mystery(2, 25));
		System.out.println(Base.mystery(3, 11));
		System.out.println(Base.power(2, 25));
		System.out.println(Base.power(3, 11));
		int a = 2, b = 25;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a);
		System.out.println(b);
	}

	@Test
	public void nineteen() {
		// 1.1.19
		long[] n = new long[100];
		n = Base.Fibonacci(n);
		for (int i = 0; i < n.length; i++) {
			StdOut.println(i + " " + n[i]);
		}
	}

	@Test
	public void twenty() {
		// 1.1.20
		System.out.println(Base.lnFactorial(2));
	}

	@Test
	public void Twenty_two() {
		// 1.1.22
		int[] i = new int[5];
		for(int j=0; j < i.length; j++) {
			i[j] = j;
		}
		System.out.println(Base.rank(2, i, 0, i.length, i.length));
	}

	@Test
	public void Twenty_four() {
		// 1.1.24
		Base.CommomDivisor(1111111, 1234567);
	}

}
