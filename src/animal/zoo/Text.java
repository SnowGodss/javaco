package animal.zoo;

import java.util.Scanner;

public class Text {
    // 異常處理練習：鍵盤錄入數據
    // 需求：
    // 鍵盤錄入自己心儀的女朋友姓名和年齡
    // 姓名的長度在 3 ~ 10 之間
    // 年齡的範圍為：18 ~ 40歲
    // 超出這個範圍是異常數據不能賦值, 需要重新錄入, 一直到錄入成功為止
    // 提示：
    // 需要考慮用戶在鍵盤錄入時的所有情況
    // 比如：錄入年齡時超出範圍, 錄入年齡時錄入了abc等情況, 結束方法, 手動拋出異常對象, 交給調用者, 方法下面的代

    // 練習：創建一個數組找出最大值
    public static void main(String[] args) {
        // 1. 創建鍵盤錄入
        Scanner sc = new Scanner(System.in);
        // 2. 女朋友對象
        Textson ts = new Textson();
        // 利用循環來實現一直錄入直到錄入成功
        while(true){
            // 判斷異常
            try {
                // 3. 接收女朋友姓名
                System.out.print("請輸入女朋友姓名：");
                String name = sc.nextLine();
                ts.setName(name);
                // 4.接收女朋友年齡
                System.out.print("請輸入女朋友年齡：");
                // 先用nextLine 來接收年齡 後面再處理異常
                String ageStr = sc.nextLine();
                // 判斷錄入年齡是否為空
                if (ageStr == null || ageStr.trim().isEmpty()) {
                    // 如果為空 就拋出異常 並重新錄入
                    throw new AgeOutofBoundsException("年齡不可為空");
                }
                // 判斷不是為空後, 就強轉Int到女朋友類中
                int age = Integer.parseInt(ageStr);
                ts.setAge(age);
                // 5. 如果都沒有出現異常 就跳出迴圈
                break;

                //判斷轉換過程中有沒有異常
            } catch (NumberFormatException e) {
                System.out.println("數字轉換錯誤 請輸入數字");

                //判斷姓名是否為空
            } catch (NullPointerException e) {
                // 為空的話就拋出異常 並重新錄入
                e.printStackTrace();

                //判斷姓名是否超出長度
            } catch (NameformatException e) {
                // 超出範圍的話就拋出異常, 並重新錄入
                e.printStackTrace();
            }
        }
        //6. 打印
        System.out.println(ts);
    }
}