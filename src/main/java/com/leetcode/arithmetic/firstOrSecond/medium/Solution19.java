package com.leetcode.arithmetic.firstOrSecond.medium;

import com.leetcode.arithmetic.model.ListNode;

/**
 * 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //暴力解法 两遍循环
        //建立一个虚拟节点指向head，可以避免一些极端情况
        ListNode summy = new ListNode(-1);
        summy.next = head;
        ListNode first = head;
        //第一遍遍历获取长度
        int length = 0;
        while ( null != first ) {
            first = first.next;
            length++;
        }
        //第二遍遍历去掉倒数第n个元素
        length -= n;
        first = summy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return summy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        Solution19 s = new Solution19();
        ListNode listNode = s.removeNthFromEnd(l1, 5);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }
}
