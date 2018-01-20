package com.algs4.chapter1.section3.practice;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

/******************************************************************************
 *  Compilation:  javac Josephus.java
 *  Execution:    java Josephus m n
 *  Dependencies: Queue.java
 *
 *  Solves the Josephus problem.
 *
 *  % java Josephus 2 7
 *  1 3 5 0 4 2 6
 *
 ******************************************************************************/

public class Josephus {

    public static void main(String[] args) {
        int m = 2;
        int n = 7;

        // initialize the queue
        Queue<Integer> queue = new Queue<Integer>();
        for (int i = 0; i < n; i++)
            queue.enqueue(i);

        while (!queue.isEmpty()) {
            for (int i = 0; i < m-1; i++)
                queue.enqueue(queue.dequeue());
            StdOut.print(queue.dequeue() + " ");
        }
        StdOut.println();
    }

}
