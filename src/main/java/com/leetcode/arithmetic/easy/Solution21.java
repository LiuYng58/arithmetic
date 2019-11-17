package com.leetcode.arithmetic.easy;

public class Solution21 {
    /**
     * 合并两个有序链表
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode pre = temp;
        while (null != l1 && null != l2){
            if (l1.val <= l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        if (l1 == null) {
            pre.next = l2;
        }else {
            pre.next = l1;
        }
        return temp.next;
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
        while(listNode.next != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }

    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
}
