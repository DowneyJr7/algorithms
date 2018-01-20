package com.algs4.chapter1.section3.practice;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

/******************************************************************************
 *  Compilation:  javac Fix.java
 *  Execution:    java InfixToPostFix
 *  Dependencies: Stack.java StdIn.java StdOut.java
 *
 *  Reads in an infix expression and outputs an equivalent postfix
 *  expression.
 *
 *  Windows users: replace [Ctrl-d] with [Ctrl-z] to signify end of file.
 *
 *  % java Fix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  [Ctrl-d]
 *  2 3 4 + 5 6 * * +
 *
 *  % java Fix | java EvaluatePostfix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  [Ctrl-d]
 *  212
 *
 ******************************************************************************/

public class Fix {

    public static void InfixToPostfix() {
        Stack<String> stack = new Stack<String>();
        while (!StdIn.isEmpty()) {
            //( ( ( 2 * 3 ) / ( 2 - 1 ) ) + ( 3 * ( 4 - 1 ) ) )
            String s = StdIn.readString();
            if      (s.equals("+")) stack.push(s);
            else if (s.equals("-")) stack.push(s);
            else if (s.equals("*")) stack.push(s);
            else if (s.equals("/")) stack.push(s);
            else if (s.equals(")")) StdOut.print(stack.pop() + " ");
            else if (s.equals("(")) StdOut.print("");
            else                    StdOut.print(s + " ");
        }
        StdOut.println();//2 3 * 2 1 - / 3 4 1 - * +
    }

    public static void InfixToPrefix() {

    }
}
