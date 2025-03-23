package animal.zoo;

public class Text3 {
    // 靈魂四問之三：
    // 如果try中遇到的問題沒有被捕獲, 怎麼執行

    // 答：會報錯, 有異常的代碼會判斷 catch 中有沒有可以接收該異常的代碼 沒有就會報錯
    // 例如: System.out.println(arr[5]); //ArrayIndexOutOfBoundsException e
    // 因為 catch (NullPointerException e) 中沒有可以接收該異常的代碼(因為他們不是父子關係), 所以報錯

    // 解決辦法：
    // 1.在 catch 中加上父類別的異常, 這樣就可以接收該異常了
    // 2. 也可以使用多重 catch 來處理多種異常

    // 注意: 如果我們要捕獲多個異常, 這些異常中存在父子關係的話, 那麼父類一定要寫在下面
    // 如果寫在上面, 下面的異常判斷會報錯
    public static void main(String[] args) {
        // 1.創建數組
        int[] arr = { 1, 2, 3, 4, 5 };

        // 2.使用 try-catch 來處理異常
        // 最後會打印 5
        try {
            // 3. 如果這裡面代碼沒問題 會執行並且不會執行catch的內容
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException e
        } catch (NullPointerException e) {
            System.out.println("沒有這個數組");
            // 這裡也可以使用 | 來接收多個異常
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("這個是正確的錯誤");
        }
    }
}