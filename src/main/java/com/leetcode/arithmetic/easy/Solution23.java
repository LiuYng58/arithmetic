package com.leetcode.arithmetic.easy;

import java.util.Arrays;

public class Solution23 {
    /**
     * 删除有序数组的重复项
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int[] arrs = Arrays.stream(nums).distinct().toArray();
        for(int i=0;i<arrs.length;i++) {
            nums[i]=arrs[i];
        }
        return arrs.length;
    }

    /**
     * nums 是一个有序数组
     * 思路是使用快慢指针
     * @param nums
     * @return
     */
    public static int removeDuplicates2(int[] nums) {
        if (null == nums || nums.length == 0){
            return 0;
        }
        int len = 0;
        for (int i = 1;i<nums.length;i++){
            if (nums[len] != nums[i]) {
                nums[++len]=nums[i];
            }
        }
        return len+1;
    }

    public static void main(String[] args) {
        /**
         * 没注意审题，测试用例编错了
         */
//        int[] nums = new int[] {1,2,3,2,6,2,8,7,1};
        /**
         * 给定一个排序数组
         */
        int[] nums = new int[] {1,2,2,3,5,8,8,9};
//        nums = Arrays.stream(nums).distinct().toArray();
//        removeDuplicates2(nums);
        int size = removeDuplicates2(nums);
        for (int i=0;i<size;i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
