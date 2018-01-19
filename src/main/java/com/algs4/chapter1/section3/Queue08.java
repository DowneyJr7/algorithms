package com.algs4.chapter1.section3;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author donny
 * queue是一种基于先进先出（FIFO）策略的集合类型
 * Page No.95 算法1.3 FIFO queue（链表实现）
 */
public class Queue08 {
    public static void main(String[] args) {
        //创建一个queue并操作字符串入列或出列
        Queue<String> q = new Queue<String>();
        //to be or not to - be - - that - - - is
        while (!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!"-".equals(item)){
                q.enqueue(item);
            }else if(!q.isEmpty()){
                StdOut.println(q.dequeue() + " ");
            }
        }
        StdOut.println("(" + q.size() + " left on stack)");
    }
}
