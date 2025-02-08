package animal.zoo;

import java.util.ArrayList;
import java.util.Collections;

public class Text {
    public static void main(String[] args) {
        /*
         * 自動點名器3： 班級裡有N個學生, 實現隨機點名器 要求： 被點到的學生不會再被點到 但如果班級中所有的學生都點完了 需要重新開啟第二輪點名
         */

        // 1. 定義集合
        ArrayList<String> list = new ArrayList<>();
        // 2. 添加數據
        Collections.addAll(list, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        // 3. 創建一個臨時的集合, 用來存已經被點到學生的名字
        ArrayList<String> list2 = new ArrayList<>();
        // 外循環：表示輪數
        for (int i = 0; i <= 10; i++) {
            System.out.println("第" + i + "輪");
            // 打亂集合數據
            Collections.shuffle(list);
            // 內循環：表示每一輪隨機抽取的過程
            for (int j = 0; j < list.size();) {
                // 刪除第一個數據並取出
                String name = list.remove(0);
                // 把取出的數據添加到臨時集合
                list2.add(name);
                System.out.print(name + " ");
            }
            System.out.println();

            // 此時表示一輪點名結束
            // list 空了 list2 10個學生的名字
            list.addAll(list2);
            list2.clear();
        }
    }
}