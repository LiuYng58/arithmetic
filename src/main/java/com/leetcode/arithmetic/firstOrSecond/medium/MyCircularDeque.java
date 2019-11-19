package com.leetcode.arithmetic.firstOrSecond.medium;

public class MyCircularDeque {

    private int capacity;
    private int size = 0;

    MyNode first;
    MyNode last;


    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        capacity = k;
    }

    /** 将一个元素添加到双端队列头部 */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        MyNode f = first;
        MyNode newNode = new MyNode(null, value, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
        return true;
    }

    /** 将一个元素添加到双端队列尾部 */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        MyNode l = last;
        MyNode newNode = new MyNode(l, value, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        return true;
    }

    /** 从双端队列头部删除一个元素 */
    public boolean deleteFront() {
        if (isEmpty()){
            return false;
        }
        MyNode f = first;
        if (f == null) {
            return false;
        }

        MyNode next = f.next;
        f.next = null;
        first = next;
        if (next == null) {
            last = null;
        } else {
            next.prev = null;
        }
        size--;
        return true;
    }

    /** 从双端队列尾部删除一个元素。 */
    public boolean deleteLast() {
        if (isEmpty()){
            return false;
        }
        MyNode l = last;
        if (l == null) {
            return false;
        }
        MyNode prev = l.prev;
        l.prev = null;
        last = prev;
        if (prev == null) {
            first = null;
        }else {
            prev.next = null;
        }
        size--;
        return true;
    }

    /** 从双端队列头部获得一个元素。 */
    public int getFront() {
        MyNode f = first;
        if (f == null) {
            return -1;
        }
        return f.val;
    }

    /** 获得双端队列的最后一个元素 */
    public int getRear() {
        MyNode l = last;
        if (l == null) {
            return -1;
        }
        return l.val;
    }

    /** 检查双端队列是否为空. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** 检查双端队列是否满了 */
    public boolean isFull() {
        return size == capacity;
    }

    private static class MyNode{
        int val;
        MyNode next;
        MyNode prev;
        MyNode(MyNode prev, int value, MyNode next) {
            this.val = value;
            this.next = next;
            this.prev = prev;
        }
    }
}


