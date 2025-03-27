package animal.zoo;

public class Text {
    // throws ：寫在方法益處, 表示聲明一個異常, 告訴調用者, 使用本方法可能會有哪些異常把異常的錯誤訊息輸出在控制台
    // throw ：注意：寫在方法內, 結束方法, 手動拋出異常對象, 交給調用者, 方法下面的代

    //練習：創建一個數組找出最大值
    public static void main(String[] args) {
        // 1.創建數組
        int[] arr = null;
        try {
            System.out.println(max(arr));
        }  catch (NullPointerException e) {
            System.out.println("數組不能為空1");
        }   catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("數組長度不能為0 1");
        }
        System.out.println("看看我執行了嗎？");
        
    }
    public static int max(int[] arr) {
        if (arr == null){
            // 手動創建一個異常對象, 並把這個異常交給調用者處理
            // 此時方法就會結束, 下面的代碼不會在執行
            throw new NullPointerException("數組不能為空 2");
        }

        if (arr.length == 0){
            // 手動創建一個異常對象, 並把這個異常交給調用者處理
            // 此時方法就會結束, 下面的代碼不會在執行
            throw new ArrayIndexOutOfBoundsException("數組長度不能為0 2");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}