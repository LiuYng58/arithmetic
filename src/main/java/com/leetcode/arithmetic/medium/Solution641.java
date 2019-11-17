package com.leetcode.arithmetic.medium;

public class Solution641 {


    public static void main(String[] args) {
        MyCircularDeque circularDeque = new MyCircularDeque(3); // 设置容量大小为3
        System.out.println("返回true ：" + circularDeque.insertLast(1));
        System.out.println("返回1 ：" + circularDeque.getFront());
        System.out.println("返回1 ：" + circularDeque.getRear());
        System.out.println("返回true ：" + circularDeque.insertLast(2));
        System.out.println("返回1 ：" + circularDeque.getFront());
        System.out.println("返回2 ：" + circularDeque.getRear());
        System.out.println("返回true ：" + circularDeque.insertFront(3));
        System.out.println("返回false ：" + circularDeque.insertFront(4));
        System.out.println("返回3 ：" + circularDeque.getFront());
        System.out.println("返回2 ：" + circularDeque.getRear());
        System.out.println("返回true ：" + circularDeque.isFull());
        System.out.println("返回true ：" + circularDeque.deleteLast());
        System.out.println("返回true ：" + circularDeque.insertFront(4));
        System.out.println("返回4 ：" + circularDeque.getFront());
    }

}
