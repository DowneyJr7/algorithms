package com.algs4.chapter1.section3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 
 * @author donny
 * 栈是一种基于后进先出（LIFO）策略的集合类型
 * Page No.78 1.3.1.6 栈
 */
public class Stack03 {
	public static void reverse() {
		Stack<Integer> stack = new Stack<Integer>();

		while (!StdIn.isEmpty()) {
			stack.push(StdIn.readInt());
		}

		for (Integer integer : stack) {
			StdOut.println(integer);
		}
	}

	public static void main(String[] args) {
		// reverse();
		/**
		 * 1 2 3 4 5
		 * 
		 * 5 4 3 2 1
		 */

		evaluate();
		// ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) 101.0
		// ( ( 1 + sqrt ( 5.0 ) ) / 2.0 ) 1.618033988749895
	}

	/**
	 * 双栈算术表达式求值算法 Dijkstra
	 */
	public static void evaluate() {
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		while (!StdIn.isEmpty()) {
			String s = StdIn.readString();
			switch (s) {//运算符
			case "(":
				break;
			case "+":
				ops.push(s);
				break;
			case "-":
				ops.push(s);
				break;
			case "*":
				ops.push(s);
				break;
			case "/":
				ops.push(s);
				break;
			case "sqrt":
				ops.push(s);
				break;
			case ")"://）后，运算
				String op = ops.pop();
				double v = vals.pop();
				switch (op) {
				case "+":
					v = vals.pop() + v;
					break;
				case "-":
					v = vals.pop() - v;
					break;
				case "*":
					v = vals.pop() * v;
					break;
				case "/":
					v = vals.pop() / v;
					break;
				case "sqrt":
					v = Math.sqrt(v);
					break;
				default:
					break;
				}
				vals.push(v);
				break;
			default://非运算符，则是数字
				vals.push(Double.parseDouble(s));
				break;
			}
		}
		StdOut.println(vals.pop());
	}
}
