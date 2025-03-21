package animal.zoo;

public class Text2 {
    // 捕獲異常：(自己處理)
    // 格式：try{可能會出現錯誤的代碼}catch(異常類名 變量名){異常的處理代碼}
    // 目的：當代碼出現異常時, 可以讓程序繼續往下執行

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        try {
            System.out.println(arr[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有這個數組");
        }
        System.out.println("看看我執行了沒");
    }
}