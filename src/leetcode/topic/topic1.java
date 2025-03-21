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
        // 1. 创建一个 HashMap 存放元素及其在 nums 数组中的索引
        HashMap<Integer, Integer> hm = new HashMap<>();
        // 2.遍歷 nums 数组
        for (int i = 0; i < nums.length; i++) {
            // 3. 如果 HashMap 中存在 complement 元素，表示找到了符合的元素
            // 總而言之：6 - x = y
            // x 為當前遍歷的數字
            // y 為得到的數字
            int complement = target - nums[i];
            // 4. 判斷鍵是否存在於 HashMap 中
            // 總而言之就是判斷 得到的數字 y 有沒有在 HashMap 中
            if (hm.containsKey(complement)) {
                // 如果 y 存在於 HashMap 中的話就返回 x 的索引和 y 的索引
                return new int[] { hm.get(complement), i };
            }
            // 5. 如果 y 不存在於 HashMap 中的話就將當前遍歷的數字和其索引添加到 HashMap 中
            // 目的：避免同一個元素自我配對, 只有在補數出現之後才會回傳索引
            hm.put(nums[i], i);
        }
        return new int[] {};
    }
}