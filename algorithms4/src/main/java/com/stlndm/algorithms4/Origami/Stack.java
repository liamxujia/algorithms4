package com.stlndm.algorithms4.Origami;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * Stack
 * 下压堆栈（链表实现）
 */
public class Stack<T> {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmply()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
    private class Node {
        T item;
        Node next;
    }
    private Node first; // 栈顶
    private int N; // 元素数量
    
    public boolean isEmply() {
        return first == null;
    }
    public int size() {
        return N;

    }
    public void push(T item) {
        // 向栈顶添加元素
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    public T pop() {
        // 从栈顶删除元素
        T item = first.item;
        first = first.next;
        N--;
        return item;
    }
}