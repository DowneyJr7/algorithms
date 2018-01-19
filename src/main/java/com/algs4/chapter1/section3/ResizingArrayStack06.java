package com.algs4.chapter1.section3;

import java.util.Iterator;

/**
 *
 * @param <Item>
 * @author donny
 * stack是一种基于后进先出（LIFO）策略的集合类型
 * Page No.88 算法1.1 LIFO stack 能够动态调整数组大小的实现
 */
public class ResizingArrayStack06<Item> implements Iterable<Item> {

    private Item[] a = (Item[])new Object[1]; //栈元素
    private int N = 0;//元素数量

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    private void resize(int max){
        //将大小为N <= max的栈移动到一个新的大小为max的数组中
        Item[] temp = (Item[]) new Object[max];
        for (int i=0; i<N; i++){
            temp[i] = a[i];
        }
        a = temp;
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

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    /**
     * 支持后进先出的迭代
     */
    private class ReverseArrayIterator implements Iterator<Item>{

        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
