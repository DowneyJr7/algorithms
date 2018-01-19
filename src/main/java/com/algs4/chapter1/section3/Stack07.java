package com.algs4.chapter1.section3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author donny
 * stack是一种基于后进先出（LIFO）策略的集合类型
 * Page No.94 算法1.2 LIFO stack（链表实现）
 */
public class Stack07 {
    public static void main(String[] args) {
        //创建一个栈并根据StdIn中的指示压入或弹出字符串
        Stack<String> s = new Stack<String>();
        //to be or not to - be - - that - - - is
        //it was - the best - of times - - - it was - the - -
        //was best times of the was the it
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!"-".equals(item)){
                s.push(item);
            }else if(!s.isEmpty()){
                StdOut.println(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
