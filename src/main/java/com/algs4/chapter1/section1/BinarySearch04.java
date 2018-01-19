package com.algs4.chapter1.section1;

/**
 * @author donny 
 * 二分查找
 */
public class BinarySearch04 {

	/**
	 * 二分查找的递归实现 
	 * Page No.15 1.1.6.4 递归
	 */
	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length - 1);
	}

	public static int rank(int key, int[] a, int lo, int hi) {
		// 如果key存在于a[]中，它的索引不会小于lo且不会大于hi
		if (lo > hi)
			return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid])
			return rank(key, a, lo, mid - 1);
		else if (key > a[mid])
			return rank(key, a, mid + 1, hi);
		else
			return mid;
	}

	public static void main(String[] args) {
		// int[] whitelist = new int[5];
		// for(int i=0; i<5; i++) {
		// whitelist[i] = i;
		// }
		// while (!StdIn.isEmpty()) {
		//
		// }
		// System.out.println(rank(0, whitelit));

		// int[] whitelist = In.readInts("/home/donny/number");
		// Arrays.sort(whitelist);
		// for (int i : whitelist) {
		// System.out.println(i);
		// }
		//
		// StdOut.println(rank(7, whitelist));
	}
	
	/**
	 * 二分查找
	 * Page No.28 1.1.10 二分查找
	 */
	public static int ranks(int key, int[] a) {
		// 数组必须是有序得
		int lo = 0;// 头指针
		int hi = a.length - 1;// 尾指针
		while (lo <= hi) {
			// 被查找得键要么不存在，要么必然存在于a[lo..hi]之中
			int mid = lo + (hi - lo) / 2;// 当前索引
			if (key < a[mid])
				hi = mid - 1;
			else if (key > a[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}
}
