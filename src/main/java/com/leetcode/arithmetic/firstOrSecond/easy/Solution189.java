package com.leetcode.arithmetic.firstOrSecond.easy;

public class Solution189 {
    /*
     * @lc app=leetcode.cn id=189 lang=java
     *
     * [189] 旋转数组
     */

    public void rotate(int[] nums, int k) {
        int temp,per;
        for (int i = 0;i < k; i++) {
            per = nums[nums.length-1];
            for (int j = 0;j < nums.length; j++) {
                temp = nums[j];
                nums[j] = per;
                per = temp;
            }
        }
    }

    /**
     * 使用额外数组,空间复杂度不符合题目要求
     * @param nums
     * @param k
     */
    public void rotate2(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0;i < nums.length; i++) {
            temp[(i + k)%nums.length] = nums[i];
        }
        for (int j = 0; j < nums.length;j++){
            nums[j] = temp[j];
        }
    }

}
