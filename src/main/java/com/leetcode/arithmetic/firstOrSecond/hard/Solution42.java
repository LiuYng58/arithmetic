package com.leetcode.arithmetic.firstOrSecond.hard;

/**
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 *
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）
 * 示例:
 *
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 */
public class Solution42 {
    /**
     * 解法一暴力解法
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int left_max = 0;
        int right_max = 0;
        int ans = 0;
        for (int i = 1;i < height.length - 1; i++) {
            //向左遍历找最大值
            left_max = height[i];
            right_max = height[i];
            for (int j = i; j > 0;j--) {
                left_max = max(left_max,height[j]);
            }
            //向右遍历找最大值
            for (int j = i; j < height.length;j++) {
                right_max = max(right_max,height[j]);
            }
            //计算ans
            ans = ans + min(left_max,right_max) - height[i];
        }
        return ans;
    }

    /**
     * 解法二 双指针
     * @param height
     * @return
     */
    public int trap2(int[] height) {
        return 0;
    }

    /**
     * 解法三 使用栈
     * @param height
     * @return
     */
    public int trap3(int[] height) {
        return 0;
    }

    private int max(int a,int b) {
        return a > b ? a : b;
    }

    private int min(int a,int b) {
        return a < b ? a : b;
    }
}
