package leetcode.topic;

public class topic1523 {
    /*
     * 1523. 對區間範圍內的奇數進行計數 給定兩個非負整數 low 和 high。返回介於low和 high （含） 之間的奇數計數。
     */
    public static void main(String[] args) {
        System.out.println(countOdds(3, 7)); // Output: 3
        System.out.println(countOdds(8, 10)); // Output: 1
    }

    public static int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
