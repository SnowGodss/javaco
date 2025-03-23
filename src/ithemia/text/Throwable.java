package ithemia.text;

public class Throwable {
    // Throwable 的成員方法
    // 方法名。 說明
    // public String getMessage() 返回此throwable 的詳細訊息字符串
    // public String toString() 返回此拋出的簡短描述
    // public void printStackTrace() 把異常的錯誤訊息輸出在控制台
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // 1. public String getMessage() 返回此throwable 的詳細訊息字符串
            String message1 = e.getMessage();
            System.out.println(message1);
            System.out.println("================================================");
            // 2. public String toString() 返回此拋出的簡短描述
            String message2 = e.toString();
            System.out.println(message2);
            System.out.println("================================================");
            // 3. public void printStackTrace() 把異常的錯誤訊息輸出在控制台
            // 細節：僅僅是打印訊息, 不會停止程序運行
            e.printStackTrace();
        }
    }
}
