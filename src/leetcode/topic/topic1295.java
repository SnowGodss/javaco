package leetcode.topic;

public class topic1295 {
    /*
     * LeetCode 1295 题目解析
     *
     * 给定一个整数数组 nums，请你返回其中位数为 偶数 的数字的数量。
     */
    public static void main(String[] args) {
        int[] arr1 = { 12, 345, 2, 6, 7896 };
        int[] arr2 = { 555, 901, 482, 1771 };
        System.out.println(findNumbers(arr1));
        System.out.println(findNumbers(arr2));
    }

    public static int findNumbers(int[] nums) {
        int counts = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] != 0) {
                count++;
                nums[i] /= 10;
            }
            if (count % 2 == 0) {
                counts++;
            }
        }
        return counts;
    }
}