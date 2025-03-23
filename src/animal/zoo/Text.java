package animal.zoo;

public class Text {
    // Throwable 的成員方法
    // 方法名。                                  說明
    // public String getMessage()               返回此throwable 的詳細訊息字符串
    // public String toString()                返回此拋出的簡短描述
    // public void printStackTrace()           把異常的錯誤訊息輸出在控制台
    public static void main(String[] args) {
        // 1.創建數組
        int[] arr = { 1, 2, 3, 4, 5 };

        // 2.使用 try-catch 來處理異常
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

        System.out.println("看看我執行了沒");
    }
}