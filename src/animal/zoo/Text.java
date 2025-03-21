package animal.zoo;

public class Text {
    // 異常：
    // 作用一：異常是用來查詢bug的關鍵參考訊息
    // 作用二：異常可以作為方法內部的一種特殊返回值, 以便通知調用者底層得執行者
    public static void main(String[] args) {
        // 1.創建學生對象
        Textson t1 = new Textson("張無忌", 23);
        // 2.年齡：同學(18 ~ 40)
        t1.setAge(50);// 就知道了賦值失敗
                      // 選擇一：自己悄悄處理
                      // 選擇二：抛出異常
        /* throw new RuntimeException("年齡必須在 18 and 40 之間"); */
    }
}