package com.algs4.chapter1.section2.practice;

import edu.princeton.cs.algs4.Transaction;

public class Base {

    // 1.2.7
    public static String mystery(String s) {
        int n = s.length();
        if (n <= 1)
            return s;
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2, n);
        return mystery(b) + mystery(a);
    }

}
