package com.algs4.chapter1.section3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.awt.event.ItemEvent;

/**
 * @author donny
 * 泛型定容栈是一种容量固定的泛型栈的抽象数据类型
 * Page No.83 1.3.2.2 泛型
 */
public class FixedCapacityStack05<Item> {

    public static void main(String[] args) {
        //to be or not to - be - - that - - - is
        FixedCapacityStack05<String> s = new FixedCapacityStack05<String>(100);

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!"-".equals(item)) {
                s.push(item);
                continue;
            }
            if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.print("(" + s.size() + " left on stack)");
    }

    private Item[] a;
    private int N;

    public FixedCapacityStack05(int cap){
        a = (Item[]) new Object[cap];
    }

    public void push(Item item){
        //将元素压入栈顶
        if (N == a.length){
            resize(2*a.length);
        }
        a[++N] = item;
    }

    public Item pop(){
        //从栈顶删除元素
        Item item = a[--N];
        a[N] = null;//避免对象游离
        if (N>0 && N==a.length/4){
            resize(a.length/2);
        }
        return item;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    //改进版
    private void resize(int max){
        //将大小为N <= max的栈移动到一个新的大小为max的数组中
        Item[] temp = (Item[]) new Object[max];
        for (int i=0; i<N; i++){
            temp[i] = a[i];
        }
        a = temp;
    }
}
