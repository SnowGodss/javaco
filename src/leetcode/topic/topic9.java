package leetcode.topic;

public class topic9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // Output: true
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(10)); // Output: false
        System.out.println(isPalindrome(11)); // Output: true
        System.out.println(isPalindrome(12321)); // Output: true
    }

    public static boolean isPalindrome(int x) {
        int answer = 0;
        int y = x;
        while (x != 0) {
            int temp = x % 10;
            answer = answer * 10 + temp;
            x /= 10;
        }
        if (answer == y && y >= 0) {
            return true;
        }
        return false;
    }
}