package animal.zoo;

public class Text4 {
    // 靈魂四問之四：
    // 如果try中遇到問題, 那try下面的其他代碼還會執行嗎

    // 答：不會
    public static void main(String[] args) {
        // 1.創建數組
        int[] arr = { 1, 2, 3, 4, 5 };

        // 2.使用 try-catch 來處理異常
        // 最後會打印：
        // 沒有這個數組
        try {
            // 3. 判斷代碼是否有異常
            // 該代碼有異常 跳到catch裡面
            System.out.println(arr[5]);
            // 上面代碼已經出現了異常 所以不會判斷到這裡
            System.out.println("看看我這行執行了嗎");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有這個數組");
        }
    }
}