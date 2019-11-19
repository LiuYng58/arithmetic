package com.leetcode.arithmetic.firstOrSecond.easy;

import java.util.Arrays;

/**
 * 合并两个有序数组
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 */
public class Solution88 {

    /**
     * 使用系统内置方法
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1, m ,n);
        Arrays.sort(nums1);
    }

    /**
     * 使用双指针方式实现
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        while (m>0 && n > 0) {
            if (nums2[n-1] >= nums1[m-1]) {
                nums1[n + m-1] = nums2[n-1];
                n--;
            }else {
                nums1[n + m-1] = nums1[m-1];
                m--;
            }
        }
        /**
         * 考虑问题不全
         */
        while (n > 0) {
            nums1[n-1] = nums2[n-1];
            n--;
        }
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{4,5,6,0,0,0};
        int[] num2 = new int[]{1,2,3};
        Solution88 solution88 = new Solution88();
        solution88.merge2(num1,3,num2,3);
        for (int n : num1){
            System.out.print(n + " ");
        }
    }
}
