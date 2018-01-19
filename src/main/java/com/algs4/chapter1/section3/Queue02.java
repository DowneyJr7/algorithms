package com.algs4.chapter1.section3;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

/**
 * 
 * @author donny
 * queue是一种基于先进先出（FIFO）策略的集合类型
 * Page No.77 1.3.1.5 队列
 */
public class Queue02 {
	
	public static void main(String[] args) {
		int[] a = readInts("/home/donny/input/queue02");
		for (int i : a) {
			System.out.println(i);
		}
	}

	public static int[] readInts(String name) {
		In in = new In(name);
		Queue<Integer> queue = new Queue<Integer>();
		while (!in.isEmpty()) {
			queue.enqueue(in.readInt());
		}

		int N = queue.size();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = queue.dequeue();
		}
		return a;
	}
}
