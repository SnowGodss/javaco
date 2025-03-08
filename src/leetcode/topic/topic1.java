package leetcode.topic;

import java.util.HashMap;

public class topic1 {
    /*
     * LeetCode 1. 两数之和（Two Sum）
     *
     * 🔹 题目描述： 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出 和为目标值 的 两个整数，并返回它们的 数组索引。
     *
     * 你可以假设 每种输入只会对应一个答案，但 不能 使用同一个元素两次。
     */
    public static void main(String[] args) {
        int[] result = twoSum(new int[] { 3, 2, 4 }, 6);
        System.out.println("Result: " + result[0] + ", " + result[1]); // Expected output: 1, 2 // [2, 3] or [3, 2] are
                                                                       // also correct.
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hm.containsKey(complement)) {
                return new int[] { hm.get(complement), i };
            }
            hm.put(nums[i], i);
        }
        return new int[] {};
    }
}