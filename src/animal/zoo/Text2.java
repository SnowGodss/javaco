package animal.zoo;

public class Text2 {
    // 靈魂四問之二：
    // 如果try中可能遇到多個問題, 怎麼執行

    // 答：當出現第一個問題的時候 下面的錯誤代碼就不會繼續判斷了, 會直接執行catch裡面的內容

    // 題外話：出現問題時, 前面如果有正確的代碼還是會執行 直到遇到問題

    public static void main(String[] args) {

        // 1. 創建數組
        int[] arr = { 1, 2, 3, 4, 5 };
        // 2.使用 try-catch 來處理異常
        // 最後會打印：
        // 2
        // 沒有這個數組
        // 看看我執行了沒
        try {
            // 3.判斷代碼是否有異常
            // 該行代碼沒問題 會打印 2
            System.out.println(arr[1]);
            // 該行代碼有問題 會跳到 catch裡面
            System.out.println(arr[8]);
            // 上面代碼已經出現了異常 所以不會判斷到這裡
            System.out.println(arr[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有這個數組");
        }
        System.out.println("看看我執行了沒");
    }
}