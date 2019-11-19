package com.leetcode.arithmetic.third.easy;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Solution21 {
    /**
     * 解题思路 新建一个链表头，依次比较l1和l2的节点，小的就放到新的链表头的后面
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(-1);
        ListNode temp = prev;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }else {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }
        }
        temp.next = l1==null ? l2 : l1;
        return prev.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int value) {
            this.val = value;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(4);
        ListNode l2 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l1.next = l3;
        l3.next = l4;
        l2.next = l5;
        l5.next = l6;
        Solution21 solution = new Solution21();
        ListNode listNode = solution.mergeTwoLists(l1, l2);
        while(listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }

    }
}
