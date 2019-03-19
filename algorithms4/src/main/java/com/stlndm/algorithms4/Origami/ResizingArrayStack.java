package com.stlndm.algorithms4.Origami;

import java.util.Iterator;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * ResizingArrayStack
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {

    public static void main(String[] args) {
        ResizingArrayStack<String> s;
        s = new ResizingArrayStack<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEnply()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
    private Item[] a = (Item[]) new Object[1]; // 栈元素
    private int N = 0;
    public boolean isEnply() {
        return N == 0;
    }
    public int size() {
        return N;
    }
    private void resize(int max) {
        // 将栈移动到一个大小为max的新数组
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
            a = temp;
        }
    }
    public void push(Item item) {
        // 将元素添加到栈顶
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }
    public Item pop() {
        // 从栈顶删除元素
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator<Item> {
        // 支持后进先出的栈
        private int i = N;
        public boolean hasNext() {
            return i > 0;
        }
        public Item next() {
            return a[--i];
        }
        public void remove() {

        }
    }
}