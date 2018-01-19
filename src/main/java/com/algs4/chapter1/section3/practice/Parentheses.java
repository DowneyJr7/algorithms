package com.algs4.chapter1.section3.practice;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Parentheses {
    public static void main(String[] args) {
        //创建一个栈并根据StdIn中的指示压入或弹出字符串
        Stack<String> s = new Stack<String>();
        //{ [ ( ) ] }
        while(!StdIn.isEmpty()){
            String ending = StdIn.readString();

            if(ending == "{" || ending == "[" || ending == "("){
                s.push(ending);
            }else if(!s.isEmpty()){
                String begin = s.pop();

                int b = begin(begin);
                int e = ending(ending);

                if(b == e){
                    StdOut.println(begin + " ");
                }

            }
        }
    }

    private static int begin(String item){
        switch (item){
            case "{":
                return 1;
            case "[":
                return 2;
            case "(":
                return 3;
            default :
                return 0;
        }
    }

    private static int ending(String item){
        switch (item){
            case "}":
                return 1;
            case "]":
                return 2;
            case ")":
                return 3;
            default :
                return 0;
        }
    }
}
